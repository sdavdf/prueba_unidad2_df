package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaMedicaRepository;
import com.example.demo.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Override
	public void insertar(CitaMedica c) {
		this.citaMedicaRepository.insertar(c);
		
	}

	@Override
	public int actualizarPorNumeroCita(Integer numeroCita, String diagnostico, String receta,
			LocalDateTime proximaCita) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.actualizarPorNumeroCita(numeroCita, diagnostico, receta, proximaCita);
	}
	

}
