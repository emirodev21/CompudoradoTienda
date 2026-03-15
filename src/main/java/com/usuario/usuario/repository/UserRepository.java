package com.usuario.usuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usuario.usuario.model.user.UserModel;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

    //crearemos metodos personalizados
    Optional<UserModel> findByCedula(Long cedula);

    Optional<UserModel> findByEmail(String email);

    void deleteByCedula(Long cedula);

}
