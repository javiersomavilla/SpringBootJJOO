package com.qindel.jjoo.exercise;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.qindel.jjoo.exercise.crud.entity.Ciudad;
import com.qindel.jjoo.exercise.crud.service.CiudadService;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@ActiveProfiles("test")
public class DAOCiudadTest {

	@Autowired
	CiudadService ciudadService;	
	
//	@Test
//	@Transactional(rollbackOn= {Exception.class})
//	public void addCiudad() throws Exception {
//		Ciudad c = ciudadService.saveCiudad(99, "Ciudad test", 98, 987);
//		if(c.getIdCiudad() == 99) {
//			throw new Exception();
//		}
//	}	
}

