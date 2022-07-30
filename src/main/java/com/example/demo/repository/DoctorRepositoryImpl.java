package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor d) {
		this.entityManager.persist(d);

	}

	@Override
	public Doctor buscar(Integer id) {
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void actualizar(Doctor d) {
		this.entityManager.merge(d);

	}

	@Override
	public void eliminar(Integer id) {
		Doctor d = this.buscar(id);

		this.entityManager.remove(d);

	}

}
