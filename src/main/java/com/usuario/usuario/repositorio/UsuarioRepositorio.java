package com.usuario.usuario.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.usuario.modelo.usuario.UsuarioModelo;

public interface UsuarioRepositorio extends JpaRepository<UsuarioModelo, Integer> {

    //crearemos metodos personalizados
    Optional<UsuarioModelo> findByCedula(Long cedula);

    Optional<UsuarioModelo> findByEmail(String email);

    void deleteByCedula(Long cedula);

}
