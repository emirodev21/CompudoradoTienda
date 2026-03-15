package com.usuario.usuario.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserBaseDTO {

    
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String cedula;
    private String direccion;
    private String password;
    
}
