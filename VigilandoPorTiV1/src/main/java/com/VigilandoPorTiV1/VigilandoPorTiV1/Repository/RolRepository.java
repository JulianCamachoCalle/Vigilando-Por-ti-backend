package com.VigilandoPorTiV1.VigilandoPorTiV1.Repository;

import com.VigilandoPorTiV1.VigilandoPorTiV1.Entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
}
