create database if not exists db_estudiantes;
use db_estudiantes;
CREATE TABLE IF NOT EXISTS estudiantes (   
id BIGINT NOT NULL AUTO_INCREMENT,   
apellido VARCHAR(50) NOT NULL,   
email VARCHAR(50) NOT NULL,   
nombre VARCHAR(50) NOT NULL,   
PRIMARY KEY (id)
);
insert into estudiantes(nombre,apellido,email) values
("bob","patiño","bobi@gmail.com"),
("jefe","gorgori","gorgori@gmail.com"),
("reverendo","alegria","japireverend@gmail.com");
