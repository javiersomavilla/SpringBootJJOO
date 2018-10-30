package com.qindel.jjoo.exercise.crud.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais", schema="juegosolimpicos")
public class QueryEjercicio2 implements Serializable{
	
	
	@Id
	private Integer idPais;
	private String nombrePais;
	private Integer idCiudad;
	private String nombreCiudad;
	private Integer valor;
	private String descripcionTipo;
	private Integer numeroVecesSede;
	
	public QueryEjercicio2() {}

	public QueryEjercicio2(Integer idPais, String nombrePais, Integer idCiudad, String nombreCiudad, Integer valor,
			String descripcionTipo, Integer numeroVecesSede) {
		this.idPais = idPais;
		this.nombrePais = nombrePais;
		this.idCiudad = idCiudad;
		this.nombreCiudad = nombreCiudad;
		this.valor = valor;
		this.descripcionTipo = descripcionTipo;
		this.numeroVecesSede = numeroVecesSede;
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

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getDescripcionTipo() {
		return descripcionTipo;
	}

	public void setDescripcionTipo(String descripcionTipo) {
		this.descripcionTipo = descripcionTipo;
	}

	public Integer getNumeroVecesSede() {
		return numeroVecesSede;
	}

	public void setNumeroVecesSede(Integer numeroVecesSede) {
		this.numeroVecesSede = numeroVecesSede;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcionTipo == null) ? 0 : descripcionTipo.hashCode());
		result = prime * result + ((idCiudad == null) ? 0 : idCiudad.hashCode());
		result = prime * result + ((idPais == null) ? 0 : idPais.hashCode());
		result = prime * result + ((nombreCiudad == null) ? 0 : nombreCiudad.hashCode());
		result = prime * result + ((nombrePais == null) ? 0 : nombrePais.hashCode());
		result = prime * result + ((numeroVecesSede == null) ? 0 : numeroVecesSede.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueryEjercicio2 other = (QueryEjercicio2) obj;
		if (descripcionTipo == null) {
			if (other.descripcionTipo != null)
				return false;
		} else if (!descripcionTipo.equals(other.descripcionTipo))
			return false;
		if (idCiudad == null) {
			if (other.idCiudad != null)
				return false;
		} else if (!idCiudad.equals(other.idCiudad))
			return false;
		if (idPais == null) {
			if (other.idPais != null)
				return false;
		} else if (!idPais.equals(other.idPais))
			return false;
		if (nombreCiudad == null) {
			if (other.nombreCiudad != null)
				return false;
		} else if (!nombreCiudad.equals(other.nombreCiudad))
			return false;
		if (nombrePais == null) {
			if (other.nombrePais != null)
				return false;
		} else if (!nombrePais.equals(other.nombrePais))
			return false;
		if (numeroVecesSede == null) {
			if (other.numeroVecesSede != null)
				return false;
		} else if (!numeroVecesSede.equals(other.numeroVecesSede))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	
}
