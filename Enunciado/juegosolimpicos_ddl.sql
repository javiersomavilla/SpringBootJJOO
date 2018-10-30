--------------------------------------------------------------
-- DATABASE: juegosolimpicos
--------------------------------------------------------------

--------------------------------------------------------------
-- DROP
------------------------------------------------------------
--DROP TABLE IF EXISTS sede_jjoo;
--DROP TABLE IF EXISTS tipo_jjoo;
--DROP TABLE IF EXISTS ciudad;
--DROP TABLE IF EXISTS pais;
--DROP SCHEMA IF EXISTS juegosolimpicos;

--------------------------------------------------------------
-- CREATE
--------------------------------------------------------------
CREATE SCHEMA juegosolimpicos;
--SET SCHEMA juegosolimpicos;
USE juegosolimpicos;

CREATE TABLE pais (
  id_pais INTEGER NOT NULL,
  nombre_pais VARCHAR(64) NOT NULL,
  codigo_pais VARCHAR(2) NOT NULL,
  valor_pais INTEGER NOT NULL,
  PRIMARY KEY (id_pais)
);

CREATE TABLE ciudad (
  id_ciudad INTEGER NOT NULL,
  nombre_ciudad VARCHAR(64) NOT NULL,
  id_pais INTEGER NOT NULL,
  valor_ciudad INTEGER DEFAULT NULL,
  PRIMARY KEY (id_ciudad),
  CONSTRAINT fk_ciudad_pais FOREIGN KEY (id_pais) REFERENCES pais (id_pais)
);

CREATE TABLE tipo_jjoo (
  id_tipo_jjoo INTEGER NOT NULL,
  descripcion_tipo VARCHAR(32) NOT NULL,
  PRIMARY KEY (id_tipo_jjoo)
);

CREATE TABLE sede_jjoo (
  a�o INTEGER NOT NULL,
  id_tipo_jjoo INTEGER NOT NULL,
  sede INTEGER NOT NULL,
  PRIMARY KEY (a�o,id_tipo_jjoo),
  CONSTRAINT fk_sede_jjoo_ciudad FOREIGN KEY (sede) REFERENCES ciudad (id_ciudad),
  CONSTRAINT fk_sede_jjoo_tipo_jjoo FOREIGN KEY (id_tipo_jjoo) REFERENCES tipo_jjoo (id_tipo_jjoo)
);

--------------------------------------------------------------
--INSERT
--------------------------------------------------------------
INSERT INTO pais 
VALUES (1,'ESPA�A','ES',100),
	(2,'PORTUGAL','PT',200),
	(3,'FRANCIA','FR',50),
	(4,'ITALIA','IT',150);

INSERT INTO ciudad 
VALUES (1,'LA CORU�A',1,93),
	(2,'MADRID',1,NULL),
	(3,'BARCELONA',1,124),
	(4,'LISBOA',2,134),
	(5,'OPORTO',2,NULL),
	(6,'COIMBRA',2,NULL),
	(7,'CHAMONIX',3,123),
	(8,'PAR�S',3,5),
	(9,'NIZA',3,NULL),
	(10,'MIL�N',4,135),
	(11,'ROMA',4,125),
	(12,'TUR�N',4,190);

INSERT INTO tipo_jjoo VALUES 
	(1,'INVIERNO'),
	(2,'VERANO');

INSERT INTO sede_jjoo VALUES 
	(1992,2,3),
	(1924,1,7),
	(1900,2,8),
	(1924,2,8),
	(1960,2,11),
	(2006,1,12);
