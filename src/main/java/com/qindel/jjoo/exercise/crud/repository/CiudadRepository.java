package com.qindel.jjoo.exercise.crud.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qindel.jjoo.exercise.crud.entity.Ciudad;

@Transactional
public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {}
