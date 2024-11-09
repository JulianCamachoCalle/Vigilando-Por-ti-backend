package com.hackaton.hackaton2024;

import com.hackaton.hackaton2024.Entity.Rol;
import com.hackaton.hackaton2024.Entity.Usuario;
import com.hackaton.hackaton2024.Entity.UsuarioRol;
import com.hackaton.hackaton2024.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Hackaton2024Application implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    public static void main(String[] args) {
        SpringApplication.run(Hackaton2024Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
		/*
		Usuario usuario = new Usuario();
		usuario.setNombre("Julian");
		usuario.setApellido("Julian");
		usuario.setUsername("Julian");
		usuario.setEmail("julian@gmail.com");
		usuario.setDni("72685844");
		usuario.setPassword("12345");
		usuario.setTelefono("999111123");
		usuario.setFotoperfil("foto.png");

		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());
		 */
    }
}
