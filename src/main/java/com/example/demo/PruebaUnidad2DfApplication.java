package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad2DfApplication implements CommandLineRunner {

	private static Logger log = Logger.getLogger(PruebaUnidad2DfApplication.class);

	@Autowired
	private IDoctorService doctorService;

	@Autowired
	private IPacienteService iPacienteService;

	@Autowired
	private ICitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// 1
		Doctor doc1 = new Doctor();
		doc1.setCedula("05034543");
		doc1.setNombre("Anibal");
		doc1.setApellido("Carvajal");
		doc1.setFechaNacimiento(LocalDateTime.of(2001, 04, 3, 0, 0));
		doc1.setNumeroConsultorio("30A");
		doc1.setCodigoSenescyt("A567");
		doc1.setGenero("M");

		Doctor doc2 = new Doctor();
		doc2.setCedula("0439935");
		doc2.setNombre("Cristian");
		doc2.setApellido("Aguilera");
		doc2.setFechaNacimiento(LocalDateTime.of(1998, 3, 2, 0, 0));
		doc2.setNumeroConsultorio("12F");
		doc2.setCodigoSenescyt("F896");
		doc2.setGenero("M");

//		this.doctorService.insertar(doc1);
//		this.doctorService.insertar(doc2);

		// 2

		Paciente paci1 = new Paciente();
		paci1.setCedula("953834245");
		paci1.setNombre("Ana");
		paci1.setApellido("Castillo");
		paci1.setFechaNacimiento(LocalDateTime.of(1999, 3, 1, 0, 0));
		paci1.setCodigoSeguro("23");
		paci1.setEstatura((float) 1.57);
		paci1.setPeso((float) 50.3);
		paci1.setGenero("F");

		Paciente paci2 = new Paciente();
		paci2.setCedula("65475758");
		paci2.setNombre("Jerson");
		paci2.setApellido("Narvaez");
		paci2.setFechaNacimiento(LocalDateTime.of(1999, 8, 1, 0, 0));
		paci2.setCodigoSeguro("567");
		paci2.setEstatura((float) 1.77);
		paci2.setPeso((float) 70.3);
		paci2.setGenero("M");

//		this.iPacienteService.insertar(paci1);
//		this.iPacienteService.insertar(paci2);

		// 3

		CitaMedica ct = new CitaMedica();
		ct.setNumeroCita(1);
		ct.setFechaProximaCita(LocalDateTime.of(2020, 3, 2, 0, 0));
		ct.setValorCita(new BigDecimal(20));
		ct.setLugarCita("Calle Patria y Bolivar");

//		this.citaMedicaService.insertar(ct);

		// 4
		this.citaMedicaService.actualizarPorNumeroCita(1, "Tiene ciertas complicaciones en el estomago",
				"Ibuprofeno de 400 mg", LocalDateTime.of(2021, 2, 1, 0, 0));
		
		// 5
	}

}
