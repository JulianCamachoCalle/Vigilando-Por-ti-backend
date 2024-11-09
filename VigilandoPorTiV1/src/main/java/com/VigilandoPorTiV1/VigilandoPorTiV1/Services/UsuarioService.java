package com.hackaton.hackaton2024.Services;

import com.hackaton.hackaton2024.Entity.Usuario;
import com.hackaton.hackaton2024.Entity.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long id);
}
