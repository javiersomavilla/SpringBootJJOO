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
import com.qindel.jjoo.exercise.crud.entity.SedeJjoo;
import com.qindel.jjoo.exercise.crud.service.CiudadService;

@RestController
public class CiudadController {
	@Autowired
	private CiudadService ciudadService;
	
	@GetMapping("/ciudades")
	public ResponseEntity<List<Ciudad>> getCiudades(HttpServletRequest req) {
		List<Ciudad> ciudades = ciudadService.getCiudades();
		return new ResponseEntity<List<Ciudad>>(ciudades, HttpStatus.OK);
	}
	
	@GetMapping("/ciudad")
	public ResponseEntity<Ciudad> getCiudad(@RequestParam int idCiudad, HttpServletRequest req) {
		Ciudad ciudad = ciudadService.getCiudad(idCiudad);
		return new ResponseEntity<Ciudad>(ciudad, HttpStatus.OK);
	}
	
	@PostMapping("/addCiudad")
	public ResponseEntity<Ciudad> addCiudad(@RequestParam int idCiudad, @RequestParam String nombreCiudad, @RequestParam int idPais, @RequestParam int valorCiudad, HttpServletRequest req) {
       Ciudad ciudad = ciudadService.saveCiudad(idCiudad, nombreCiudad, idPais, valorCiudad);
        return new ResponseEntity<Ciudad>(ciudad, HttpStatus.OK);
    } 
	
	@PostMapping("/updateCiudad")
	public ResponseEntity<Ciudad> updateCiudad(@RequestParam int idCiudad, @RequestParam String nombreCiudad, @RequestParam int idPais, @RequestParam int valorCiudad, HttpServletRequest req) {
		Ciudad ciudad = ciudadService.updateCiudad(idCiudad, nombreCiudad, idPais, valorCiudad);
        return new ResponseEntity<Ciudad>(ciudad, HttpStatus.OK);
    } 
	
	@PostMapping("/deleteCiudad")	
	public ResponseEntity<Ciudad> deleteCiudad(@RequestParam int idCiudad, HttpServletRequest req) {
		ciudadService.deleteCiudad(idCiudad);
        return new ResponseEntity<Ciudad>(HttpStatus.OK);
    }
	
}
