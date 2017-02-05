package com.prod.acad;

import java.util.ArrayList;

public class Publicacoes {
	
	ArrayList<Estudante> autores;
	private String titulo;
	private String conferencia;
	private int anoPublicacao;
	private String projetoAssociado;

	void Publicacoes(){
		autores = new ArrayList<Estudante>();
	}

	public void setAutores(ArrayList<Estudante> autores) {
		this.autores = autores;
	}

	public ArrayList<Estudante> getAutores() {
		return autores;
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getConferencia() {
		return conferencia;
	}


	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}


	public int getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}


	public String getProjetoAssociado() {
		return projetoAssociado;
	}


	public void setProjetoAssociado(String projetoAssociado) {
		this.projetoAssociado = projetoAssociado;
	}



}
