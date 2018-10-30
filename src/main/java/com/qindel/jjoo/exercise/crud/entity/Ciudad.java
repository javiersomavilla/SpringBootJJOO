package com.qindel.jjoo.exercise.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudad", schema="juegosolimpicos")
public class Ciudad {
	@Id	
	@Column(nullable=false)
	private Integer idCiudad;
	
	@Column(nullable=false)
	private String nombreCiudad;
	
	@Column(nullable=false)
	private Integer idPais;
	
	private Integer valorCiudad;
	
	public Ciudad() {}
	
	public Ciudad(Integer idCiudad, String nombreCiudad, Integer idPais, Integer valorCiudad) {
		this.idCiudad = idCiudad;
		this.nombreCiudad = nombreCiudad;
		this.idPais = idPais;
		this.valorCiudad = valorCiudad;
	}

	public Integer getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public Integer getValorCiudad() {
		return valorCiudad;
	}

	public void setValorCiudad(Integer valorCiudad) {
		this.valorCiudad = valorCiudad;
	}
}
