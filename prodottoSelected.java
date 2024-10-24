package com.example.demo;

public class prodottoSelected extends prodottoImg {
	public int qnt;

	public prodottoSelected(String nome, String marca, double prezzo, int qnt, String url) {
		super(nome, marca, prezzo, url);
		this.qnt = qnt;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	

}
