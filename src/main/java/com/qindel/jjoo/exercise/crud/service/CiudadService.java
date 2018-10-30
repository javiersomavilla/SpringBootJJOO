package com.qindel.jjoo.exercise.crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qindel.jjoo.exercise.crud.entity.Ciudad;
import com.qindel.jjoo.exercise.crud.repository.CiudadRepository;

@Service
public class CiudadService {
	
	@Autowired
	private CiudadRepository ciudadRepository;
	
	public List<Ciudad> getCiudades() {
        return ciudadRepository.findAll();
    }
	
	public Ciudad getCiudad(Integer idCiudad) {
        return ciudadRepository.findById(idCiudad).get();
    }
	
	@Transactional
	public Ciudad saveOrUpdate(Integer idCiudad, String nombreCiudad, Integer idPais, Integer valorCiudad) {
		Ciudad ciudad = ciudadRepository.findById(idCiudad).get();
		
		if(ciudad == null) {
			ciudad = saveCiudad(idCiudad, nombreCiudad, idPais, valorCiudad);
		} else {
			ciudad = updateCiudad(idCiudad, nombreCiudad, idPais, valorCiudad);
		}
		
		return ciudad;
	}
	
	@Transactional
	public Ciudad saveCiudad(Integer idCiudad, String nombreCiudad, Integer idPais, Integer valorCiudad) {
		Ciudad ciudad = new Ciudad();
		ciudad.setIdCiudad(idCiudad);
		ciudad.setNombreCiudad(nombreCiudad);
		ciudad.setIdPais(idPais);
		ciudad.setValorCiudad(valorCiudad);
		return this.ciudadRepository.save(ciudad);
	}
	
	@Transactional
	public Ciudad updateCiudad(Integer idCiudad, String nombreCiudad, Integer idPais, Integer valorCiudad) {
		Ciudad ciudad = ciudadRepository.findById(idCiudad).get();
		
		if(ciudad != null) {
			ciudad.setNombreCiudad(nombreCiudad);
			ciudad.setIdPais(idPais);
			ciudad.setValorCiudad(valorCiudad);
			ciudad = this.ciudadRepository.save(ciudad);
		}
		
		return ciudad;
	}
	
	@Transactional
	public void deleteCiudad(Integer idCiudad) {
		this.ciudadRepository.deleteById(idCiudad);
	}
}
