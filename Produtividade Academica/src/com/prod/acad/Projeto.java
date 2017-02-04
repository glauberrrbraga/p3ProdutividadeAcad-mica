package com.prod.acad;

import java.util.ArrayList;

public class Projeto {
	private String titulo;
	private String financiadora;
	private double valorFinanciado;
	private String descricao;
	private String objetivo;
	private String status;
	private String dataInicio;
	private String dataTermino;
	ArrayList<Colaborador> participantes = new ArrayList<Colaborador>();

	public void setNomeParticipante(String nome, String email) {
		Colaborador aux = new Colaborador();
		aux.setNome(nome);
		aux.setEmail(email);
		participantes.add(aux);
	}

	public ArrayList<Colaborador> getParticipantes() {
		return participantes;
	}

	public Projeto() {
		this.status = "Em Elaboração";
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
