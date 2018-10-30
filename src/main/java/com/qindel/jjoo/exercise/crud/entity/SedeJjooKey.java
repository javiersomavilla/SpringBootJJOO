package com.qindel.jjoo.exercise.crud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SedeJjooKey implements Serializable {
	@Column(name="año", nullable = false)
	private Integer año;
	
	@Column(name="id_tipo_jjoo", nullable = false)
	private Integer idTipoJjoo;
	
	public SedeJjooKey() {}

	public SedeJjooKey(Integer año, Integer idTipoJjoo) {
		this.año = año;
		this.idTipoJjoo = idTipoJjoo;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public Integer getIdTipoJjoo() {
		return idTipoJjoo;
	}

	public void setIdTipoJjoo(Integer idTipoJjoo) {
		this.idTipoJjoo = idTipoJjoo;
	}
}
