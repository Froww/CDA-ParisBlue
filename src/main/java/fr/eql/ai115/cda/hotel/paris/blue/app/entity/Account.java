package fr.eql.ai115.cda.hotel.paris.blue.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Account extends Person{

    private String username;
    private String password;
    private LocalDateTime accountCreationDate;

    public Account() {
    }

    public Account(String firstname, String lastname, String email, String phone, String username, String password) {
        super(null, firstname, lastname, email, phone);
        this.username = username;
        this.password = password;
    }
}
