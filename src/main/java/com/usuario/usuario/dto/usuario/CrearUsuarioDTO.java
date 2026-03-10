package com.usuario.usuario.dto.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearUsuarioDTO {

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    private String primer_apellido;

    //este dato es opcional, puede que el usuario solo tenga un apellido
    private String segundo_apellido;

    @NotBlank(message = "El email no puede estar vacío")
    private String email;

    @NotNull(message = "La cedula es obligatoria")
    private Long cedula;

    @NotBlank(message = "La direccion no puede estar vacía")
    private String direccion;

    @NotBlank(message = "El password no puede estar vacío")
    private String password;

}