package com.usuario.usuario.model.user;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "primer_apellido", nullable = false)
    private String first_surname;

    @Column(name = "second_surname", nullable = true)
    private String second_surname;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "identification_number", unique = true, nullable = false)
    private Long identification_number;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "password", nullable = false)
    private String password;

    @CreatedDate
    @Column(name = "creation_date", updatable = false)
    private LocalDateTime creation_date;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private ROLE role;

}