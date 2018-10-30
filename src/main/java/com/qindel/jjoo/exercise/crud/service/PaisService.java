package com.qindel.jjoo.exercise.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qindel.jjoo.exercise.crud.entity.Pais;
import com.qindel.jjoo.exercise.crud.repository.PaisRepository;

@Service
public class PaisService {
	
	@Autowired PaisRepository paisRepository;
	
	public List<Pais> getPaises(){
		return paisRepository.findAll();
	}		
	
	public Pais getPais(Integer idPais) {
		return paisRepository.findById(idPais).get();
	}
	
	public Pais saveOrUpdate(Integer idPais, String nombrePais, String codigoPais, Integer valorPais) {
		Pais pais = paisRepository.findById(idPais).get();
		
		if(pais == null) {
			pais = savePais(idPais, nombrePais, codigoPais, valorPais);
		} else {
			pais = updatePais(idPais,nombrePais,codigoPais,valorPais);
		}
		
		return pais;
	}
	
	public Pais savePais(Integer idPais, String nombrePais, String codigoPais, Integer valorPais) {
		Pais pais = new Pais();
		pais.setIdPais(idPais);
		pais.setNombrePais(nombrePais);
		pais.setCodigoPais(codigoPais);
		pais.setValorPais(valorPais);
		return this.paisRepository.save(pais);
	}
	
	public Pais updatePais(Integer idPais, String nombrePais, String codigoPais, Integer valorPais) {
		Pais pais = paisRepository.findById(idPais).get();
		
		if(pais != null) {
			pais.setNombrePais(nombrePais);
			pais.setCodigoPais(codigoPais);
			pais.setValorPais(valorPais);
			pais = this.paisRepository.save(pais);
		}
		
		return pais;
	}
	
	public void deletePais(Integer idPais) {
		this.paisRepository.deleteById(idPais);
	}
	
}
