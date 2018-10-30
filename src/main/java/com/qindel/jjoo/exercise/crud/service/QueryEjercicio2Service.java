package com.qindel.jjoo.exercise.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qindel.jjoo.exercise.crud.repository.QueryEjercicio2Repository;
import com.qindel.jjoo.exercise.crud.entity.QueryEjercicio2;

@Service
public class QueryEjercicio2Service {
	
	@Autowired QueryEjercicio2Repository queryEjercicio2Repository;
	
	public List<QueryEjercicio2> getInfo(){
		return this.queryEjercicio2Repository.getInfo();
	}
}
