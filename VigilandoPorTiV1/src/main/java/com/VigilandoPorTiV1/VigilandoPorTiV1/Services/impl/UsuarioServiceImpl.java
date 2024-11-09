package com.hackaton.hackaton2024.Services.impl;

import com.hackaton.hackaton2024.Entity.Usuario;
import com.hackaton.hackaton2024.Entity.UsuarioRol;
import com.hackaton.hackaton2024.Repository.RolRepository;
import com.hackaton.hackaton2024.Repository.UsuarioRepository;
import com.hackaton.hackaton2024.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if (usuarioLocal != null) {
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        } else {
            for (UsuarioRol usuarioRol : usuarioRoles) {
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
