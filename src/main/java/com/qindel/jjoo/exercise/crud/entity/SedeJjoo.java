package com.qindel.jjoo.exercise.crud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.qindel.jjoo.exercise.crud.entity.SedeJjooKey;

@Entity
@Table(name = "sede_jjoo", schema="juegosolimpicos")
public class SedeJjoo implements Serializable{
	
	@EmbeddedId
	private SedeJjooKey id;	
	
	@Column(nullable=false)
	private Integer sede;
	
	public SedeJjoo() {}

	public SedeJjoo(SedeJjooKey id, Integer sede) {
		this.id = id;
		this.sede = sede;
	}
	
	public SedeJjooKey getId() {
		return id;
	}

	public void setId(SedeJjooKey id) {
		this.id = id;
	}

	public Integer getSede() {
		return sede;
	}

	public void setSede(Integer sede) {
		this.sede = sede;
	}
}
