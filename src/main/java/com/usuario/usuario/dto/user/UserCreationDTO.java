package com.usuario.usuario.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreationDTO {

    @NotBlank(message = "The name is required. It cannot be empty.")
    private String name;

    @NotBlank(message = "The first_surname is required. It cannot be empty.")
    private String first_surname;

    //este dato es opcional, puede que el usuario solo tenga un apellido
    private String second_surname;

    @NotBlank(message = "The email is required. It cannot be empty.")
    private String email;

    @NotNull(message = "The identification_number is required. It cannot be empty.")
    private Long identification_number;

    @NotBlank(message = "The address is required. It cannot be empty.")
    private String address;

    @NotBlank(message = "The password is required. It cannot be empty.")
    private String password;

}
