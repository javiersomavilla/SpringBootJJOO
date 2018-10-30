package com.qindel.jjoo.exercise.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_jjoo", schema="juegosolimpicos")
public class TipoJjoo {
	@Id
	@Column(nullable=false)
	private Integer idTipoJjoo;
	
	@Column(nullable=false)
	private String descripcionTipo;
	
	public TipoJjoo() {}

	public TipoJjoo(Integer idTipoJjoo, String descripcionTipo) {
		this.idTipoJjoo = idTipoJjoo;
		this.descripcionTipo = descripcionTipo;
	}

	public Integer getIdTipoJjoo() {
		return idTipoJjoo;
	}

	public void setIdTipoJjoo(Integer idTipoJjoo) {
		this.idTipoJjoo = idTipoJjoo;
	}

	public String getDescripcionTipo() {
		return descripcionTipo;
	}

	public void setDescripcionTipo(String descripcionTipo) {
		this.descripcionTipo = descripcionTipo;
	}
	
}
