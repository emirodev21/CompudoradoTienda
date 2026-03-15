package com.usuario.usuario.modelo.usuario;

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
public class UsuarioModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "primer_apellido", nullable = false)
    private String primer_apellido;

    @Column(name = "segundo_apellido", nullable = true)
    private String segundo_apellido;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "cedula", unique = true, nullable = false)
    private Long cedula;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "password", nullable = false)
    private String password;

    @CreatedDate
    @Column(name = "fecha_creacion", updatable = false)
    private LocalDateTime fecha_creacion;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol", nullable = false)
    private ROL rol;

}