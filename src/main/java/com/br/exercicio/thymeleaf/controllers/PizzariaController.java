package com.br.exercicio.thymeleaf.controllers;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.exercicio.thymeleaf.services.PizzariaService;



@Controller
public class PizzariaController {

	@Autowired 
	private PizzariaService pizzariaservice;
	
	@GetMapping
	public ModelAndView mostrarPizza() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("Pizza",pizzariaservice.retornaLista());
	return modelAndView;
	}
	
}