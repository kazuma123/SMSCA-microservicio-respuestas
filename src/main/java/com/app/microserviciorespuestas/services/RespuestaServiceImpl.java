package com.app.microserviciorespuestas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.microserviciorespuestas.models.Respuesta;
import com.app.microserviciorespuestas.repository.RespuestaRepository;

@Service
public class RespuestaServiceImpl implements RespuestaService{

	@Autowired
	private RespuestaRepository repository;
	
	@Override
	@Transactional
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas) {
		// TODO Auto-generated method stub
		return repository.saveAll(respuestas);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long ExamenId) {
		// TODO Auto-generated method stub
		return repository.findRespuestaByAlumnoByExamen(alumnoId, ExamenId);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId) {
		// TODO Auto-generated method stub
		return repository.findExamenesIdsConRespuestasByAlumno(alumnoId);
	}

}
