package com.br.exercicio.thymeleaf.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.exercicio.thymeleaf.models.PizzariaModel;

@Service
public class PizzariaService {

	private Map<String, PizzariaModel> listaDePizzas = new HashMap<String, PizzariaModel>() {
		{
			put("1", new PizzariaModel("link da img", "sabor", "massa", "tipo da borda",20.0));

		}
	};

	public Collection<PizzariaModel> retornaLista() {
		return this.listaDePizzas.values();
	}

	public void salvarLista(PizzariaModel pizzariaModel) {
		listaDePizzas.values()(listaDePizzas.size(), pizzariaModel);

	}
}
