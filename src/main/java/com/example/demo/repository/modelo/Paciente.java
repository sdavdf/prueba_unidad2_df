package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paci_id_seq")
	@SequenceGenerator(name = "paci_id_seq", sequenceName = "paci_id_seq", allocationSize = 1)
	@Column(name = "paci_id")
	private Integer id;

	@Column(name = "paci_cedula")
	private String cedula;

	@Column(name = "paci_nombre")
	private String nombre;

	@Column(name = "paci_apellido")
	private String apellido;

	@Column(name = "paci_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;

	@Column(name = "paci_codigo_seguro")
	private String codigoSeguro;

	@Column(name = "paci_estatura")
	private Float estatura;

	@Column(name = "paci_peso")
	private Float peso;

	@Column(name = "paci_genero")
	private String genero;

	@OneToMany(mappedBy = "paciente")
	private List<CitaMedica> citas;

	// SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoSeguro() {
		return codigoSeguro;
	}

	public void setCodigoSeguro(String codigoSeguro) {
		this.codigoSeguro = codigoSeguro;
	}

	public Float getEstatura() {
		return estatura;
	}

	public void setEstatura(Float estatura) {
		this.estatura = estatura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<CitaMedica> getCitas() {
		return citas;
	}

	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", codigoSeguro=" + codigoSeguro + ", estatura=" + estatura
				+ ", peso=" + peso + ", genero=" + genero + ", citas=" + citas + "]";
	}

}