package com.example.demo;

public class prodottoImg {
	String nome;
	String marca;
	double prezzo;
	String url;
	public prodottoImg(String nome, String marca, double prezzo, String url) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.url = url;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
