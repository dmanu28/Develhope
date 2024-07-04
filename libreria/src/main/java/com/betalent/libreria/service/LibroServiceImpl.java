package com.betalent.libreria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.betalent.libreria.entity.Libro;
import com.betalent.libreria.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	private LibroRepository libroRepo;
	
	public LibroServiceImpl(LibroRepository libroRepo) {
		this.libroRepo = libroRepo;
	}
	@Override
	public Libro creaLibro(Libro libro) {
		return libroRepo.save(libro);
	}

	@Override
	public List<Libro> mostraLibri() {
		return libroRepo.findAll();
	}

	@Override
	public Libro mostraLibroPerId(Integer id) {
		return libroRepo.findById(id).orElseThrow();
	}

	@Override
	public void cancellaLibro(Integer id) {
		libroRepo.deleteById(id);
	}

}
