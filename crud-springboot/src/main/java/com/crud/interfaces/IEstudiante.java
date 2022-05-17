package com.crud.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.entidad.Estudiante;

@Repository
public interface IEstudiante extends JpaRepository<Estudiante, Long>{
	
}
