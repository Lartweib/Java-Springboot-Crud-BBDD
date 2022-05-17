package com.crud.interfaceService;

import java.util.List;

import com.crud.entidad.Estudiante;

public interface IestudianteService {
	
	public List<Estudiante>listarTodosLosEstudiantes();

	public Estudiante guardarEstudiante(Estudiante estudiante);
	
	public Estudiante obtenerEstudianteId(Long id);
	
	public Estudiante actualizarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante(Long id) ;
}
