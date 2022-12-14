package com.idat.EF4TuristaMicroservicio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EF4TuristaMicroservicio.dto.TuristaDTO;
import com.idat.EF4TuristaMicroservicio.models.Turista;
import com.idat.EF4TuristaMicroservicio.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {

  @Autowired
  private TuristaRepository repository;
  
  @Override
  public List<TuristaDTO> listar() {
    List<TuristaDTO> lstDto = new ArrayList<>();
    TuristaDTO dto = null;

    for (Turista obj : repository.findAll()) {
      dto = new TuristaDTO();
      dto.setCodigo(obj.getIdTurista());
      dto.setNombre(obj.getNombreTurista());
      dto.setCelular(obj.getNroCelular());
      dto.setDireccion(obj.getDireccion());
      lstDto.add(dto);
    }

    return lstDto;
  }

  @Override
  public TuristaDTO obtenerId(Integer id) {
    Turista obj = repository.findById(id).orElse(null);
    TuristaDTO dto = new TuristaDTO();
    dto.setCodigo(obj.getIdTurista());
    dto.setNombre(obj.getNombreTurista());
    dto.setCelular(obj.getNroCelular());
    dto.setDireccion(obj.getDireccion());
    return dto;
  }

  @Override
  public void guardar(TuristaDTO turista) {
    Turista obj = new Turista();
    obj.setIdTurista(turista.getCodigo());
    obj.setNombreTurista(turista.getNombre());
    obj.setNroCelular(turista.getCelular());
    obj.setDireccion(turista.getDireccion());
    repository.save(obj);
  }

  @Override
  public void actualizar(TuristaDTO turista) {
    Turista obj = new Turista();
    obj.setIdTurista(turista.getCodigo());
    obj.setNombreTurista(turista.getNombre());
    obj.setNroCelular(turista.getCelular());
    obj.setDireccion(turista.getDireccion());
    repository.saveAndFlush(obj);
  }

  @Override
  public void eliminar(Integer id) {
    repository.deleteById(id);
  }
  
}
