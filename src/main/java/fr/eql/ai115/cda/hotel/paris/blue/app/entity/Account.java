package fr.eql.ai115.cda.hotel.paris.blue.app.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account extends Person{

    private String username;
    private String password;
    private LocalDateTime accountCreationDate;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "account_role",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles = new ArrayList<>();

    public Account() {
    }

    public Account(String firstname, String lastname, String email, String phone, String username, String password) {
        super(null, firstname, lastname, email, phone);
        this.username = username;
        this.password = password;
    }
}
