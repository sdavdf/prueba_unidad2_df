package com.example.demo.repository;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica c) {
		this.entityManager.persist(c);

	}

	@Override
	public CitaMedica buscar(Integer id) {
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public int actualizarPorNumeroCita(Integer numeroCita, String diagnostico, String receta,
			LocalDateTime proximaCita) {
		Query myQuery = this.entityManager.createQuery(
				"UPDATE Cita p SET p.diagnostico = :datoDiagnostico, p.receta = :datoReceta, p.fecha_cita = datoCita WHERE p.numero_cita = :datoNumero");
		myQuery.setParameter("datoDiagnostico", diagnostico);
		myQuery.setParameter("datoReceta", receta);
		myQuery.setParameter("datoCita", proximaCita);
		myQuery.setParameter("datoNumero", numeroCita);
		return myQuery.executeUpdate();
	}

	@Override
	public void eliminar(Integer id) {
		CitaMedica c = this.buscar(id);

		this.entityManager.remove(c);

	}

}
