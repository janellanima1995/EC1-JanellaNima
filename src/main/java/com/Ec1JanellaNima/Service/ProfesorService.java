package com.Ec1JanellaNima.Service;

import java.util.List;

import com.Ec1JanellaNima.Model.Profesor;

public interface ProfesorService {
	
	void guardarProfesor(Profesor profesor);
	void actualizarProfesor(Profesor profesor);
	void eliminarProfesor(Integer id);
	List<Profesor> listarProfesor();
	Profesor obtenerProfesorId(Integer id); 

}
