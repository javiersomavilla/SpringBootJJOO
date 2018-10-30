package com.qindel.jjoo.exercise.crud.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qindel.jjoo.exercise.crud.entity.SedeJjoo;
import com.qindel.jjoo.exercise.crud.entity.SedeJjooKey;

@Transactional
public interface SedeJjooRepository extends JpaRepository<SedeJjoo, Integer>{
	
	public SedeJjoo findById(SedeJjooKey sedeJjooKey);
	public void deleteById(SedeJjooKey sedeJjooKey);	
	
}
