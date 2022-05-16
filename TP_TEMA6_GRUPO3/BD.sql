create database if not exists bd_tp3;
use bd_tp3;
create table if not exists nacionalidad (
  nacionalidad_id int(11),
  descripcion varchar(50) default null,
  primary key (nacionalidad_id)
);
create table if not exists autor
(
     autor_id int(11),
     nombre varchar(50),
     apellido varchar(50),
     nacionalidad_id int(11),
     email varchar(250),
     primary key (autor_id),
     foreign key (nacionalidad_id) references nacionalidad (nacionalidad_id)
);
create table if not exists genero
(
     genero_id int(11),
     descripcion varchar(50),
     primary key (genero_id)
);
create table if not exists libro
(
     isbn int(11),
     titulo varchar(50),
     fecha_lanzamiento datetime,
     idioma varchar(50),
     cantidad_paginas int(11),
	 autor_id int(11),
	 descripcion varchar(250),
	 genero_id int(11),
     primary key (isbn),
     foreign key (autor_id) references autor (autor_id),
	 foreign key (genero_id) references genero (genero_id)
);
create table if not exists biblioteca
(
     biblioteca_id int(11),
     isbn int(11),
     fecha_alta datetime,
     estado int(11),
     primary key (biblioteca_id),
	 foreign key (isbn) references libro (isbn)
 );