package com.qindel.jjoo.exercise;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.qindel.jjoo.exercise.crud.entity.QueryEjercicio2;
import com.qindel.jjoo.exercise.crud.repository.CiudadRepository;
import com.qindel.jjoo.exercise.crud.repository.QueryEjercicio2Repository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class DAOQueryEjercicio2Test {

	@Autowired
	QueryEjercicio2Repository queryEjercicio2Repository;
		
	@Test
	public void resultadoContieneElemento() {
		List<QueryEjercicio2> resultado = queryEjercicio2Repository.getInfo();		
		QueryEjercicio2 expected = new QueryEjercicio2(3,"FRANCIA",7,"CHAMONIX",123,"INVIERNO",1);		
		assertTrue(resultado.contains(expected));
	}
	
	@Test
	public void resultadoNoContieneElemento() {
		List<QueryEjercicio2> resultado = queryEjercicio2Repository.getInfo();		
		QueryEjercicio2 expected = new QueryEjercicio2(28,"FRANCIA",7,"CHAMONIX",123,"INVIERNO",1);		
		assertFalse(resultado.contains(expected));
	}
}
