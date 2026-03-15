package com.usuario.usuario.dto.usuario;

import java.time.LocalDateTime;

import com.usuario.usuario.modelo.usuario.ROL;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioGerenteDTO {

    private Integer id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String cedula;
    private String direccion;
    private String password;
    private LocalDateTime fechaCreacion;
    private ROL rol;
}
