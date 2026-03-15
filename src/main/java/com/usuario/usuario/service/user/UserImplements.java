package com.usuario.usuario.service.user;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserImplements extends UserDetailsService {

    @Override
    UserDetails loadUserByUsername(String email);

}
