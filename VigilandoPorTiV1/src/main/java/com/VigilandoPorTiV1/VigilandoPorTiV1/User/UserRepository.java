package com.VigilandoPorTiV1.VigilandoPorTiV1.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    @Modifying()
    @Query("update User u set u.username=:username, u.password=:password, u.nombre=:nombre, u.apellido=:apellido, u.departamento=:departamento, u.provincia=:provincia, u.distrito=:distrito, u.email=:email, u.dni=:dni, u.telefono=:telefono where u.id=:id")
    void updateUser(@Param(value = "id") Long id,
                    @Param(value = "username") String username,
                    @Param(value = "password") String password,
                    @Param(value = "nombre") String nombre,
                    @Param(value = "apellido") String apellido,
                    @Param(value = "departamento") String departamento,
                    @Param(value = "provincia") String provincia,
                    @Param(value = "distrito") String distrito,
                    @Param(value = "email") String email,
                    @Param(value = "dni") String dni,
                    @Param(value = "telefono") String telefono);
}
