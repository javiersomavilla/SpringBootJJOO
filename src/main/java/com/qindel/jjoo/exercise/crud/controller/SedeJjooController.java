package com.qindel.jjoo.exercise.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qindel.jjoo.exercise.crud.entity.SedeJjoo;
import com.qindel.jjoo.exercise.crud.service.SedeJjooService;

@RestController
public class SedeJjooController {

	@Autowired SedeJjooService sedeJjooService;
	
	@GetMapping("/sedesJjoo")
	public ResponseEntity<List<SedeJjoo>> getSedesJjoo(HttpServletRequest req) {
		List<SedeJjoo> sedesJjoo = sedeJjooService.getSedesJjoo();
		return new ResponseEntity<List<SedeJjoo>>(sedesJjoo, HttpStatus.OK);
	}
	
	@GetMapping("/sedeJjoo")
	public ResponseEntity<SedeJjoo> getSedeJjoo(@RequestParam int año,@RequestParam int idTipoJjoo, HttpServletRequest req) {
		SedeJjoo sedeJjoo = sedeJjooService.getSedeJjoo(año, idTipoJjoo);
		return new ResponseEntity<SedeJjoo>(sedeJjoo, HttpStatus.OK);
	}
	
	@PostMapping("/addSedeJjoo") 	
	public ResponseEntity<SedeJjoo> addSedeJjoo(
			@RequestParam int idPais, @RequestParam String nombrePais, @RequestParam String codigoPais, @RequestParam int valorPais,
			@RequestParam int idCiudad, @RequestParam String nombreCiudad, @RequestParam(required=false) Integer valorCiudad,
			@RequestParam int año, @RequestParam int idTipoJjoo, @RequestParam int sede,
			HttpServletRequest req) {
       SedeJjoo sedeJjoo = sedeJjooService.saveSedeJjoo(idPais, nombrePais, codigoPais, valorPais,
											   			idCiudad, nombreCiudad, valorCiudad,
											   			año, idTipoJjoo, sede);
        return new ResponseEntity<SedeJjoo>(sedeJjoo, HttpStatus.OK);
    }
	
	@PostMapping("/updateSedeJjoo") 
    public ResponseEntity<SedeJjoo> updateSedeJjoo(@RequestParam int año, @RequestParam int idTipoJjoo, @RequestParam int sede, HttpServletRequest req) {
		SedeJjoo sedeJjoo = sedeJjooService.updateSedeJjoo(año, idTipoJjoo, sede);
        return new ResponseEntity<SedeJjoo>(sedeJjoo, HttpStatus.OK);
    }
	
	@PostMapping("/deleteSedeJjoo")	
	public ResponseEntity<SedeJjoo> deleteUser(@RequestParam int año, @RequestParam int idTipoJjoo, HttpServletRequest req) {
		sedeJjooService.deleteSedeJjoo(año, idTipoJjoo);
        return new ResponseEntity<SedeJjoo>(HttpStatus.OK);
    }
	 
}
