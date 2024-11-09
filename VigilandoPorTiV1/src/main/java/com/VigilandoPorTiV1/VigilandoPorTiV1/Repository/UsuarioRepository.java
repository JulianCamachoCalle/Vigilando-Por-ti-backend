package com.VigilandoPorTiV1.VigilandoPorTiV1.Repository;

import com.VigilandoPorTiV1.VigilandoPorTiV1.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Encontrar segun usuario
    public Usuario findByUsername(String username);
}
