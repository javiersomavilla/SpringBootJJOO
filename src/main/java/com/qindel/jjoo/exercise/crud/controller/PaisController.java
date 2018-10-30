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

import com.qindel.jjoo.exercise.crud.entity.Ciudad;
import com.qindel.jjoo.exercise.crud.entity.Pais;
import com.qindel.jjoo.exercise.crud.service.PaisService;

@RestController
public class PaisController {

	@Autowired private PaisService paisService;
	
	@GetMapping("/paises")
	public ResponseEntity<List<Pais>> getPaises(HttpServletRequest req) {
		List<Pais> paises = paisService.getPaises();
		return new ResponseEntity<List<Pais>>(paises, HttpStatus.OK);
	}
	
	@GetMapping("/pais")
	public ResponseEntity<Pais> getPais(@RequestParam int idPais, HttpServletRequest req) {
		Pais pais = paisService.getPais(idPais);
		return new ResponseEntity<Pais>(pais, HttpStatus.OK);
	}
	 
	@PostMapping("/addPais")
	public ResponseEntity<Pais> addPais(@RequestParam int idPais, @RequestParam String nombrePais, @RequestParam String codigoPais, @RequestParam int valorPais, HttpServletRequest req) {
       Pais pais = paisService.savePais(idPais, nombrePais, codigoPais, valorPais);
        return new ResponseEntity<Pais>(pais, HttpStatus.OK);
    } 
	
	@PostMapping("/updatePais")
	public ResponseEntity<Pais> updatePais(@RequestParam int idPais, @RequestParam String nombrePais, @RequestParam String codigoPais, @RequestParam int valorPais, HttpServletRequest req) {
		Pais pais = paisService.updatePais(idPais, nombrePais, codigoPais, valorPais);
        return new ResponseEntity<Pais>(pais, HttpStatus.OK);
    } 
	
	@PostMapping("/deletePais")	
	public ResponseEntity<Pais> deleteCiudad(@RequestParam int idPais, HttpServletRequest req) {
		paisService.deletePais(idPais);
        return new ResponseEntity<Pais>(HttpStatus.OK);
    }
	 
}
