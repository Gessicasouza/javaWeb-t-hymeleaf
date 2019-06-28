package com.br.exercicio.thymeleaf.models;

public class PizzariaModel {

	private String imagem;
	private String sabor;
	private String massa;
	private String tipoDeBorda;
	private double valor;

	public PizzariaModel() {

	}

	public PizzariaModel(String imagem, String sabor, String massa, String tipoDeBorda, double valor) {
		this.imagem = imagem;
		this.sabor = sabor;
		this.massa = massa;
		this.tipoDeBorda = tipoDeBorda;
		this.valor = valor;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getTipoDeBorda() {
		return tipoDeBorda;
	}

	public void setTipoDeBorda(String tipoDeBorda) {
		this.tipoDeBorda = tipoDeBorda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder catalago = new StringBuilder();

		catalago.append("Sabor: " + this.sabor + "\n");
		catalago.append("Massa: " + this.massa);
		catalago.append("Tipo de borda: " + this.tipoDeBorda + "\n");
		catalago.append("valor: " + this.valor + "\n");

		return catalago.toString();
	}

}
