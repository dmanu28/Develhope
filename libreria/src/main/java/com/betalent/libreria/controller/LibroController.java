package com.betalent.libreria.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.betalent.libreria.entity.Libro;
import com.betalent.libreria.service.LibroServiceImpl;

@Controller
public class LibroController {

	private LibroServiceImpl libroService;
	
	public LibroController(LibroServiceImpl libroService) {
		this.libroService = libroService;
	}
	
	@GetMapping("/libreria/home")
	public String vaiAllaHome(Model model) {
		List<Libro> catalogo = libroService.mostraLibri();
		model.addAttribute("catalogo", catalogo);
		return "index";
	}
	
	@GetMapping("/libreria/home/nuovo")
	public String mostraNuovoLibro(Model model) {
		Libro libro = new Libro();
		model.addAttribute("libro", libro);
		return "aggiungi-libro";
	}
	
	@PostMapping("/libreria/home/aggiungiLibro")
	public String salvaLibro(@ModelAttribute("libro") Libro libro) {
		libroService.creaLibro(libro);
		return "redirect:/libreria/home";
	}
	
	@GetMapping("/libreria/home/modifica/{id}")
	public String modificaLibro(@PathVariable(name = "id") Integer id, Model model) {
		Libro libro = libroService.mostraLibroPerId(id);
		model.addAttribute("libro", libro);
		return "modifica-libro";
	}
	
		@GetMapping("/libreria/home/cancella/{id}")
		public String cancellaLibro(@PathVariable(name = "id") Integer id) {
			libroService.cancellaLibro(id);
			return "redirect:/libreria/home";
	}
}
