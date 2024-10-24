package com.example.demo;

public class personaSelected extends personaStipendio {
	int qnt;
	int stipendio;
	
	public personaSelected(String nome, String cognome, int stipendio, int qnt, String url) {
		super(nome, cognome, stipendio, url);
		this.qnt = qnt;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
}
