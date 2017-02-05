package com.prod.acad;

import java.util.ArrayList;

public class Projeto {
	private String titulo;
	private String dataInicio;
	private String dataTermino;
	private String financiadora;
	private double valorFinanciado;
	private String objetivo;
	private String descricao;
	private String status;
	ArrayList<Professor> profParticipantes; //Deve ter no mínimo 1
	ArrayList<Estudante> estParticipantes; //Pode ter varios
	ArrayList<Publicacoes> publicacoes; //Deve ter pelo menos uma pra poder mudar o status pra concluido
	//Dentro de cada projeto tem um arraylist contendo os colaboradores

	public Projeto() {
		this.status = "Em Elaboração";
		estParticipantes = new ArrayList<Estudante>();
		profParticipantes = new ArrayList<Professor>();
		publicacoes = new ArrayList<Publicacoes>();
	}
	
	public void addEstudante(ArrayList<Estudante> est) {		
		estParticipantes.addAll(est);
	}
	public void addProfessor(ArrayList<Professor> prof) {		
		profParticipantes.addAll(prof);
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getFinanciadora() {
		return financiadora;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public String getStatus() {
		return status;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getValorFinanciado() {
		return valorFinanciado;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setFinanciadora(String financiadora) {
		this.financiadora = financiadora;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setValorFinanciado(double valorFinanciado) {
		this.valorFinanciado = valorFinanciado;
	}

}
