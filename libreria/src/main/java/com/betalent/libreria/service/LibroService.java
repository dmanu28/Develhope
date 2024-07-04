package com.betalent.libreria.service;

import java.util.List;

import com.betalent.libreria.entity.Libro;

public interface LibroService {

	public Libro creaLibro(Libro libro);
	public List<Libro>mostraLibri();
	public Libro mostraLibroPerId(Integer id);
	public void cancellaLibro(Integer id);
}
