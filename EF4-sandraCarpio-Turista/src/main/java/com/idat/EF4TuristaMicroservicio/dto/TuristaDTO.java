package com.idat.EF4TuristaMicroservicio.dto;

import lombok.Data;

@Data
public class TuristaDTO {
  private Integer codigo;
	private String nombre;
	private String celular;
	private String direccion;
}
