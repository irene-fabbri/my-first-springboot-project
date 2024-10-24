package com.example.demo;

public class personaStipendio extends persona {
	 int stipendio;

	public personaStipendio(String nome, String cognome, int stipendio, String url) {
		super(nome, cognome, url);
		this.stipendio = stipendio;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	 
}
