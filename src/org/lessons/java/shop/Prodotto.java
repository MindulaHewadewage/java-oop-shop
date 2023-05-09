package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;
	
	public Prodotto(String nome,String descrizione,int prezzo,int iva) {
		Random rnd = new Random();
		codice =rnd.nextInt(999999999);
		
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
//	codice
	public int getCodice() {
		return codice;
	}
	
//	nome
	public String getNome() {
		return nome;
	}
	
	public String getNomecompleto() {
		return getCodice() +  getNome();
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
//	descrizione
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione=descrizione;
	}
	
	
//	PREZZO
	public int getPrezzo() {
		return prezzo;
	}
	
	public double getIvaPrice() {
		return prezzo +(prezzo*iva)/100;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo=prezzo;
	}
	
	
//	IVA
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva=iva;
	}
	
	@Override
	public String toString() {
		return "[" + getCodice() + "]" + getNome()
		+"\n" + getPrezzo() + "(" + getIva() + "%)"
		+"\n" + getIvaPrice();
	}
	

}
