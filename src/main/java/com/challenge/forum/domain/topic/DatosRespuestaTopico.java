package com.challenge.forum.domain.topic;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje,
                                   String fecha, String status, Long autor,
                                   String curso) {
    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(),
                topico.getStatus().toString(), topico.getAutor(), topico.getCurso().toString());
    }
}
