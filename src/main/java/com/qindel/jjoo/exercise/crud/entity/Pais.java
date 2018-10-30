package com.qindel.jjoo.exercise.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais", schema="juegosolimpicos")
public class Pais {
	@Id
	@Column(nullable=false)
	private Integer idPais;
	
	@Column(nullable=false)
	private String nombrePais;
	
	@Column(nullable=false)
	private String codigoPais;
	
	@Column(nullable=false)
	private Integer valorPais;
	
	public Pais() {}

	public Pais(Integer idPais, String nombrePais, String codigoPais, Integer valorPais) {
		this.idPais = idPais;
		this.nombrePais = nombrePais;
		this.codigoPais = codigoPais;
		this.valorPais = valorPais;
	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public Integer getValorPais() {
		return valorPais;
	}

	public void setValorPais(Integer valorPais) {
		this.valorPais = valorPais;
	}
	
}
