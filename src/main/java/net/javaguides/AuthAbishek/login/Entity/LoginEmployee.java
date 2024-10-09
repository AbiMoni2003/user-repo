package net.javaguides.AuthAbishek.login.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "login")
public class LoginEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "phone_No",unique = true)
    private String lastName; // Corrected spelling

    @Column(name = "passeord")
    private String password;

    @Column(name = "email_id")
    private String emailId;
}