package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteRepository {

	public void insertar(Paciente p);
	
	public Paciente buscar(Integer id); 
	
	public void actualizar(Paciente p);
	
	public void eliminar(Integer id);
}
