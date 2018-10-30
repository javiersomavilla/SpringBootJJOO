package com.qindel.jjoo.exercise.crud.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qindel.jjoo.exercise.crud.entity.TipoJjoo;

@Transactional
public interface TipoJjooRepository extends JpaRepository<TipoJjoo, Integer>{}
