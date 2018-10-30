package com.qindel.jjoo.exercise.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qindel.jjoo.exercise.crud.entity.QueryEjercicio2;
import com.qindel.jjoo.exercise.crud.service.QueryEjercicio2Service;

@RestController
public class QueryEjercicio2Controller {

	@Autowired private QueryEjercicio2Service queryEjercicio2Service;
	
	@GetMapping("/info")
	public ResponseEntity<List<QueryEjercicio2>> getPaises(HttpServletRequest req) {
		List<QueryEjercicio2> rows = queryEjercicio2Service.getInfo();
		return new ResponseEntity<List<QueryEjercicio2>>(rows, HttpStatus.OK);
	}
	 
}
