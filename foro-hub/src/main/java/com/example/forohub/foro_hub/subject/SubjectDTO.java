package com.example.forohub.foro_hub.subject;

public record SubjectDTO(
        Long user_id,
        String course,
        String title,
        String message,
        Boolean enable
) {
}
