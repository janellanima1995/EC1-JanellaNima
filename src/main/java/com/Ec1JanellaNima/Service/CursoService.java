package com.Ec1JanellaNima.Service;

import java.util.List;

import com.Ec1JanellaNima.Model.Curso;

public interface CursoService {
	
	void guardarCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);
	List<Curso> listarCurso();
	Curso obtenerCursoId(Integer id); 

}
