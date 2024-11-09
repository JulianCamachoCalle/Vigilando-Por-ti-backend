package com.VigilandoPorTiV1.VigilandoPorTiV1.User;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponse updateUser(UserRequest userRequest) {

        User user = User.builder()
                .id(userRequest.id)
                .username(userRequest.getUsername())
                .password(userRequest.getPassword())
                .nombre(userRequest.getNombre())
                .apellido(userRequest.getApellido())
                .email(userRequest.getEmail())
                .dni(userRequest.getDni())
                .telefono(userRequest.getTelefono())
                .role(Role.USER)
                .build();

        userRepository.updateUser(user.id, user.username, user.password, user.nombre, user.apellido, user.email, user.dni, user.telefono);

        return new UserResponse("El usuario se registró exitosamente!");
    }

    public UserDTO getUser(long id) {
        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            UserDTO userDTO = UserDTO.builder()
                    .id(user.id)
                    .username(user.username)
                    .password(user.password)
                    .nombre(user.nombre)
                    .apellido(user.apellido)
                    .email(user.email)
                    .dni(user.dni)
                    .telefono(user.telefono)
                    .build();
            return userDTO;
        }
        return null;
    }
}
