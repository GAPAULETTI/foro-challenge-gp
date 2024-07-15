package com.challenge.forum.domain.topic;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje,
                                    String status, String curso) {
}
