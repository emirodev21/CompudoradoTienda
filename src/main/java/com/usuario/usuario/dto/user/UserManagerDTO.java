package com.usuario.usuario.dto.user;

import java.time.LocalDateTime;

import com.usuario.usuario.model.user.ROLE;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserManagerDTO {

    private Integer id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String cedula;
    private String direccion;
    private String password;
    private LocalDateTime fechaCreacion;
    private ROLE rol;
}
