package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPacienteRepository;
import com.example.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Override
	public void insertar(Paciente p) {
		this.iPacienteRepository.insertar(p);
		
	}

	@Override
	public Paciente buscar(Integer id) {
		return this.iPacienteRepository.buscar(id);
	}

	@Override
	public void actualizar(Paciente p) {
		this.iPacienteRepository.actualizar(p);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.iPacienteRepository.eliminar(id);
		
	}

}
