package com.VigilandoPorTiV1.VigilandoPorTiV1.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    Long id;
    String username;
    String password;
    String nombre;
    String apellido;
    String departamento;
    String provincia;
    String distrito;
    String email;
    String dni;
    String telefono;
}
