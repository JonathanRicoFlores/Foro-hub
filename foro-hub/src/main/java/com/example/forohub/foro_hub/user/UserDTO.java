package com.example.forohub.foro_hub.user;

public record UserDTO(
        String name,
        String username,
        String password,
        Boolean enable
) {
}
