package com.qindel.jjoo.exercise.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qindel.jjoo.exercise.crud.entity.TipoJjoo;
import com.qindel.jjoo.exercise.crud.repository.TipoJjooRepository;

@Service
public class TipoJjooService {
	
	@Autowired TipoJjooRepository tipoJjooRepository;
	
	public List<TipoJjoo> getTiposJjoo(){
		return this.tipoJjooRepository.findAll();
	}
	
	public TipoJjoo getTipoJjoo(Integer idTipoJjoo) {
		return this.tipoJjooRepository.findById(idTipoJjoo).get();
	}
	
	public TipoJjoo saveTipoJjoo(Integer idTipoJjoo, String descripcion_tipo) {
		return this.tipoJjooRepository.save(new TipoJjoo(idTipoJjoo, descripcion_tipo));
	}
	
	public TipoJjoo updateTipoJjoo(Integer idTipoJjoo, String descripcionTipo) {
		TipoJjoo tipoJjoo = this.tipoJjooRepository.findById(idTipoJjoo).get();
		
		if(tipoJjoo != null) {
			tipoJjoo.setDescripcionTipo(descripcionTipo);
			tipoJjoo = this.tipoJjooRepository.save(tipoJjoo);
		}
		
		return tipoJjoo;
	}
	
	public void deleteTipoJjoo(Integer idTipoJjoo) {
		this.tipoJjooRepository.deleteById(idTipoJjoo);
	}

}
