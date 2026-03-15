package com.usuario.usuario.dto.user;

import java.time.LocalDateTime;

import com.usuario.usuario.model.user.ROLE;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserManagerDTO {

    private Integer id;
    private String name;
    private String first_surname;
    private String second_surname;
    private String email;
    private String identification_number;
    private String address;
    private String password;
    private LocalDateTime creation_date;
    private ROLE role;
}
