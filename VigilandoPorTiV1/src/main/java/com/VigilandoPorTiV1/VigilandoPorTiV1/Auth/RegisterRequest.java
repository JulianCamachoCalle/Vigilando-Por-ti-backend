package com.VigilandoPorTiV1.VigilandoPorTiV1.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
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
