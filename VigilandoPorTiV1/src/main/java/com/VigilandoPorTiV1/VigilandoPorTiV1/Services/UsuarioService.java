package com.VigilandoPorTiV1.VigilandoPorTiV1.Services;


import com.VigilandoPorTiV1.VigilandoPorTiV1.Entity.Usuario;
import com.VigilandoPorTiV1.VigilandoPorTiV1.Entity.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long id);
}
