package com.challenge.forum.domain.topic;

public record DatosListadoTopico(Long id, String titulo, String mensaje,
                                 String fecha, String Status,
                                 Long autor, String curso) {
    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(),
                topico.getStatus().toString(), topico.getAutor(), topico.getCurso().toString());
    }
}
