package com.Ec1JanellaNima.Service;

import java.util.List;

import com.Ec1JanellaNima.Model.Universidad;

public interface UniversidadService {
	
	
	void guardarUniversidad(Universidad universidad);
	void actualizarUniversidad(Universidad universidad);
	void eliminarUniversidad(Integer id);
	List<Universidad> listarUniversidad();
	Universidad obtenerUniversidadId(Integer id); 

}
