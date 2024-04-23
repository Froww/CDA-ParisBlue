package fr.eql.ai115.cda.hotel.paris.blue.app.service.impl;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Account;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Role;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.LoginDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.RegisterDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.AccountRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.PersonRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.RoleRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.security.jwt.JWTGenerator;
import fr.eql.ai115.cda.hotel.paris.blue.app.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;

@Service
public class AuthServiceImpl implements AuthService {

    private AuthenticationManager authenticationManager;
    private PersonRepository personRepository;
    private AccountRepository accountRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    private JWTGenerator jwtGenerator;

    @Autowired
    public AuthServiceImpl(AuthenticationManager authenticationManager, PersonRepository personRepository, AccountRepository accountRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder, JWTGenerator jwtGenerator) {
        this.authenticationManager = authenticationManager;
        this.personRepository = personRepository;
        this.accountRepository = accountRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
    }
    @Override
    public ResponseEntity<String> register(RegisterDto registerDto) {
        if (accountRepository.existsByUsername(registerDto.getUsername())) {
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }

        Account account = new Account();
        account.setUsername(registerDto.getUsername());
        account.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        Role roles = roleRepository.findByName("USER").get();
        account.setRoles(Collections.singletonList(roles));
        account.setFirstname(registerDto.getFirstname());
        account.setLastname(registerDto.getLastname());
        account.setEmail(registerDto.getEmail());
        account.setPhone(registerDto.getPhone());
        account.setAccountCreationDate(LocalDateTime.now());

        accountRepository.save(account);

        return new ResponseEntity<>("User registered successfully!", HttpStatus.OK);

    }

    @Override
    public String login(LoginDto loginDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return jwtGenerator.generateToken(authentication);
    }
}
