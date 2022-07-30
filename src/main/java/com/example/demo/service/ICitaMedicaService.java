package com.example.demo.service;

import java.time.LocalDateTime;

import com.example.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaService {

	public void insertar(CitaMedica c);
	
	public int actualizarPorNumeroCita(Integer numeroCita, String diagnostico, String receta,
			LocalDateTime proximaCita);
}
