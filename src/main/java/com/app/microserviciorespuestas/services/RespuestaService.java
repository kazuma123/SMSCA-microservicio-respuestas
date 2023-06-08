package com.app.microserviciorespuestas.services;

import com.app.microserviciorespuestas.models.Respuesta;

public interface RespuestaService {
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);
	public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long ExamenId);
	public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId);
}
