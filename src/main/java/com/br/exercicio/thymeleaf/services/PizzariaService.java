package com.br.exercicio.thymeleaf.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.exercicio.thymeleaf.models.PizzariaModel;

@Service
public class PizzariaService {
	
	private Map<Integer, PizzariaModel> listaDePizzas = new HashMap<Integer, PizzariaModel>() {
		{
			put(1, new PizzariaModel("Portuguesa", "Italiana", "Cheddar", 32.00));
			put(2, new PizzariaModel("4 Queijos", "Italiana", "Catupiry", 35.00));
			put(3, new PizzariaModel("Espanhola", "Italiana", "sem borda", 30.00));
			put(4, new PizzariaModel("Americana","Italiana", "Catupiry", 31.00));
		}
	};
	
	public Collection<PizzariaModel> mostrarListaPizzas() {
		return this.listaDePizzas.values();
	}
	
	public void addPizza(PizzariaModel pizzariaModel) {
		listaDePizzas.put(listaDePizzas.size()+1, pizzariaModel);
	}
	
	public PizzariaModel procurarPizza(String sabor) {
		PizzariaModel pizzariaModel = null;
		
		for (PizzariaModel pizzaSabor : listaDePizzas.values()) {
			if(pizzaSabor.getSabor().equalsIgnoreCase(sabor)) {
				pizzariaModel= pizzaSabor;
			}
		}
		return pizzariaModel;
	}

}
