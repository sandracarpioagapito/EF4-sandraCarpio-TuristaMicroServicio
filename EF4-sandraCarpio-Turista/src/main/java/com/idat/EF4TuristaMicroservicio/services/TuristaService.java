package com.idat.EF4TuristaMicroservicio.services;

import java.util.List;

import com.idat.EF4TuristaMicroservicio.dto.TuristaDTO;

public interface TuristaService {
  List<TuristaDTO> listar();
	TuristaDTO obtenerId(Integer id);
	void guardar(TuristaDTO turista);
	void actualizar(TuristaDTO turista);
	void eliminar(Integer id);
}
