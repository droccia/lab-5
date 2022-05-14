create table nacionalidad
(
     nacionalidad_id number constraint nacionalidad_id_nn not null, constraint nacionalidad_id_pk primary key (nacionalidad_id),
     descripcion varchar2(50)
);
create table autor
(
     autor_id number constraint autor_id_nn not null, constraint autor_id_pk primary key (autor_id),
     nombre varchar2(50),
     apellido varchar2(50),
     nacionalidad_id number,
     email varchar2(250),
     constraint nacionalidad_fk foreign key (nacionalidad_id) references nacionalidad (nacionalidad_id)
);
create table genero
(
     genero_id number constraint genero_id_nn not null, constraint genero_id_pk primary key (genero_id),
     descripcion varchar2(50)
);
create table libro
(
     isbn number constraint isbn_nn not null, constraint isbn_pk primary key (isbn),
     titulo varchar2(50),
     fecha_lanzamiento date,
     idioma varchar2(50),
     cantidad_paginas number,
	 autor_id number,
	 descripcion varchar2(250),
	 genero_id number,
	 constraint autor_fk foreign key (autor_id) references autor (autor_id),
     constraint genero_fk foreign key (genero_id) references genero (genero_id)
);
create table biblioteca
(
     biblioteca_id number constraint biblioteca_id_nn not null, constraint biblioteca_id_pk primary key (biblioteca_id),
     isbn number,
     fecha_alta date,
     estado number,
	 constraint biblioteca_fk foreign key (isbn) references libro (isbn)
 );
