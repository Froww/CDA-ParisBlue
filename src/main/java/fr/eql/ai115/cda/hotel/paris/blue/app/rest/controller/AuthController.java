package fr.eql.ai115.cda.hotel.paris.blue.app.rest.controller;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.AuthResponseDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.LoginDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.RegisterDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.service.AuthService;
import org.aspectj.weaver.patterns.IToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto) {
        return authService.register(registerDto);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginDto loginDto) {
        String token = authService.login(loginDto);
        return new ResponseEntity<>(new AuthResponseDto(token), HttpStatus.OK);
    }
}
