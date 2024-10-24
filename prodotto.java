package com.example.demo;

public class prodotto {
	String nome;
	String marca;
	double prezzo;
	public prodotto(String nome, String marca, double prezzo) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
