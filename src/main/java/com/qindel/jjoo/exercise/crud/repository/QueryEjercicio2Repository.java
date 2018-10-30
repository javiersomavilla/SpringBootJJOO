package com.qindel.jjoo.exercise.crud.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;

import com.qindel.jjoo.exercise.crud.entity.QueryEjercicio2;

@Transactional
public interface QueryEjercicio2Repository extends JpaRepository<QueryEjercicio2, Integer> {
	@Async
	@Query(value=
			"SELECT 	p.id_pais, \n" + 
	 		"			p.nombre_pais, \n" + 
	 		"			c.id_ciudad, \n" + 
	 		"			c.nombre_ciudad, \n" + 
	 		"			IFNULL(c.valor_ciudad, p.valor_pais) as valor, \n" + 
	 		"			tjo.descripcion_tipo, \n" + 
	 		"			(select count(*) from sede_jjoo where sede = c.id_ciudad) as numero_veces_sede\n" + 
	 		"from sede_jjoo sjo\n" + 
	 		"inner join tipo_jjoo tjo 	on tjo.id_tipo_jjoo = sjo.id_tipo_jjoo\n" + 
	 		"inner join ciudad c 		on sjo.sede = c.id_ciudad\n" + 
	 		"inner join pais p 			on c.id_pais = p.id_pais\n" + 
	 		"group by 1,2,3,4,5,6",nativeQuery=true)
	 public List<QueryEjercicio2> getInfo();		 
}
