package com.qindel.jjoo.exercise.crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qindel.jjoo.exercise.crud.entity.SedeJjoo;
import com.qindel.jjoo.exercise.crud.entity.SedeJjooKey;
import com.qindel.jjoo.exercise.crud.repository.SedeJjooRepository;

@Service
public class SedeJjooService {

	@Autowired SedeJjooRepository sedeJjooRepository;
	@Autowired CiudadService ciudadService;
	@Autowired PaisService paisService;
	
	public List<SedeJjoo> getSedesJjoo(){
		return sedeJjooRepository.findAll();
	}
	
	public SedeJjoo getSedeJjoo(Integer año, Integer idTipoJjoo){
		return sedeJjooRepository.findById(new SedeJjooKey(año, idTipoJjoo));
	}
		
	public SedeJjoo saveSedeJjoo(
			Integer idPais, String nombrePais, String codigoPais, Integer valorPais,
			Integer idCiudad, String nombreCiudad, Integer valorCiudad,
			Integer año, Integer idTipoJjoo, Integer sede) {
		
		paisService.saveOrUpdate(idPais, nombrePais, codigoPais, valorPais);
		ciudadService.saveOrUpdate(idCiudad, nombreCiudad, idPais, valorCiudad);
		
		SedeJjooKey idSede = new SedeJjooKey(año, idTipoJjoo);
		SedeJjoo sedeJjoo = new SedeJjoo(idSede, sede);		
		return sedeJjooRepository.save(sedeJjoo);
		
	}
	
	public SedeJjoo updateSedeJjoo(int año, int idTipoJjoo, int sede) {		
		SedeJjoo sedeJjoo = sedeJjooRepository.findById(new SedeJjooKey(año, idTipoJjoo));
		
		if(sedeJjoo != null) {			
			sedeJjoo.setSede(sede);
			sedeJjoo = this.sedeJjooRepository.save(sedeJjoo);
		}
		
		return sedeJjoo;
    }
	
	public void deleteSedeJjoo(Integer año, Integer idTipoJjoo) {
		sedeJjooRepository.deleteById(new SedeJjooKey(año, idTipoJjoo));
	}
	
}
