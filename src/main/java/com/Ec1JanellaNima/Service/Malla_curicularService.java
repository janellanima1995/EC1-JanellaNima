package com.Ec1JanellaNima.Service;

import java.util.List;

import com.Ec1JanellaNima.Model.Malla_curicular;



public interface Malla_curicularService {

	void guardarMalla_curicular(Malla_curicular malla_curicular);
	void actualizarMalla_curicular(Malla_curicular malla_curicular);
	void eliminarMalla_curicular(Integer id);
	List<Malla_curicular> listarMalla_curicular();
	Malla_curicular obtenerMalla_curicularId(Integer id); 
}
