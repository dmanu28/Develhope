package com.betalent.libreria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.betalent.libreria.entity.UserEntity;
import com.betalent.libreria.service.UserServicImpl;

@Controller
public class UserController {

	private UserServicImpl userService;

	public UserController(UserServicImpl userService) {
		this.userService = userService;
	}
	
	@GetMapping("/homepage")
	public String mostraHomePage() {
		return "homepage";
	}
	
	@GetMapping("/registra")
	public String registraUser(Model model) {
		UserEntity user = new UserEntity();
		model.addAttribute("user", user);
		return "registration-form";
	}
	
	@PostMapping("/registraUtente")
	public String registraUser(@ModelAttribute("user") UserEntity user) {
		userService.salvaUtente(user);
		return "registrazione-ok";
	}
	
	@GetMapping("/login")
	public String loginPage(Model model) {
		UserEntity user = new UserEntity();
		model.addAttribute("user", user);
		return "login";
	}
	
	@PostMapping("/login")
	public String isRegistered(@ModelAttribute("user") UserEntity user) {
		if(userService.isRegistered(user) == true) {
			return "redirect:/libreria/home";
		}
		return "login";
	}
	
	@GetMapping("/findUser/{email}")
	public String findUser(@PathVariable(name = "email") String email, Model model) {
		UserEntity user = userService.findUser(email);
		model.addAttribute("user", user);
		return "user-found";
	}
}
