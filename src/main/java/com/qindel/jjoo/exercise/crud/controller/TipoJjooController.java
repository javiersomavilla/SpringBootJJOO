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
import com.qindel.jjoo.exercise.crud.entity.TipoJjoo;
import com.qindel.jjoo.exercise.crud.service.TipoJjooService;

@RestController
public class TipoJjooController {

	@Autowired private TipoJjooService tipoJjOoService;
	
	@GetMapping("/tiposJjoo")
	public ResponseEntity<List<TipoJjoo>> getTiposJjoo(HttpServletRequest req) {
		List<TipoJjoo> tiposJjoo = tipoJjOoService.getTiposJjoo();
		return new ResponseEntity<List<TipoJjoo>>(tiposJjoo, HttpStatus.OK);
	}
	
	@GetMapping("/tipoJjoo")
	public ResponseEntity<TipoJjoo> getTipoJjoo(@RequestParam int idTipoJjoo, HttpServletRequest req) {
		TipoJjoo tipoJjoo = tipoJjOoService.getTipoJjoo(idTipoJjoo);
		return new ResponseEntity<TipoJjoo>(tipoJjoo, HttpStatus.OK);
	}
	
	@PostMapping("/addTipoJjoo") 	
	public ResponseEntity<TipoJjoo> addTipoJjoo(@RequestParam int idTipoJjoo, @RequestParam String descripcionTipo, HttpServletRequest req) {
       TipoJjoo tipoJjoo = tipoJjOoService.saveTipoJjoo(idTipoJjoo, descripcionTipo);
        return new ResponseEntity<TipoJjoo>(tipoJjoo, HttpStatus.OK);
    }
	
	@PostMapping("/updateTipoJjoo") 
    public ResponseEntity<TipoJjoo> updateTipoJjoo(@RequestParam int idTipoJjoo, @RequestParam String descripcionTipo, HttpServletRequest req) {
		TipoJjoo tipoJjoo = tipoJjOoService.updateTipoJjoo(idTipoJjoo, descripcionTipo);
        return new ResponseEntity<TipoJjoo>(tipoJjoo, HttpStatus.OK);
    }
	
	@PostMapping("/deleteTipoJjoo")	
	public ResponseEntity<TipoJjoo> deleteTipoJjoo(@RequestParam int idTipoJjoo, HttpServletRequest req) {
		tipoJjOoService.deleteTipoJjoo(idTipoJjoo);
        return new ResponseEntity<TipoJjoo>(HttpStatus.OK);
    }
}
