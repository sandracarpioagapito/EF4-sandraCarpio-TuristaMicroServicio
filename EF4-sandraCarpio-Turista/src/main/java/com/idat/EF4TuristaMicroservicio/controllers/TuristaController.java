package com.idat.EF4TuristaMicroservicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EF4TuristaMicroservicio.dto.TuristaDTO;
import com.idat.EF4TuristaMicroservicio.services.TuristaService;

@Controller
@RequestMapping("/api/turista/v1")
public class TuristaController {
  
  @Autowired
  private TuristaService service;

  @GetMapping("/listar")
  public @ResponseBody List<TuristaDTO> listar() {
    return service.listar();
  }

  @GetMapping("/listar/{id}")
  public @ResponseBody TuristaDTO obtenerId(@PathVariable Integer id) {
    return service.obtenerId(id);
  }

  @PostMapping("/guardar")
  public @ResponseBody void guardar(@RequestBody TuristaDTO dto) {
    service.guardar(dto);
  }

  @PutMapping("/actualizar")
  public @ResponseBody void actualizar(@RequestBody TuristaDTO dto) {
    service.actualizar(dto);
  }

  @DeleteMapping("/eliminar/{id}")
  public @ResponseBody void eliminar(@PathVariable Integer id) {
    service.eliminar(id);
  }
}
