package com.br.exercicio.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.exercicio.thymeleaf.models.PizzariaModel;
import com.br.exercicio.thymeleaf.services.PizzariaService;

@Controller
public class PizzariaController {

	@Autowired
	private PizzariaService pizzariaService;
	
	@GetMapping("/")
	public ModelAndView mostrarPizza() {
		ModelAndView modelAndView = new ModelAndView("sistemapizzaria.html");
		modelAndView.addObject("Lista de Pizzas", pizzariaService.mostrarListaPizzas());
		return modelAndView;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView cadastrarPizza() {
		ModelAndView modelAndView = new ModelAndView("cadrastpizzas.html");
		return modelAndView;
	}
		
	@PostMapping
	public String adicionarPizza(PizzariaModel pizzariaModel) {
		pizzariaService.addPizza(pizzariaModel);
		return "redirect:/";
	}
	
	@GetMapping("/{sabor}")
	public ModelAndView buscarPizza(@PathVariable String sabor) {
		ModelAndView modelAndView = new ModelAndView("catalagopizza.html");
		modelAndView.addObject("pizzas", pizzariaService.procurarPizza(sabor));
		return modelAndView;
	}

}