package com.example.demo.repository;

import java.time.LocalDateTime;

import com.example.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {

	public void insertar(CitaMedica c);
	
	public CitaMedica buscar(Integer id); 
	
	public int actualizarPorNumeroCita(Integer numeroCita, String diagnostico, String receta, LocalDateTime proximaCita);
	
	public void eliminar(Integer id);
}
