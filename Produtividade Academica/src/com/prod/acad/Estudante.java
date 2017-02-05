package com.prod.acad;

public class Estudante extends Colaborador {
	private String curso;
	private short numeroProjetos;

	public short getNumeroProjetos() {
		return numeroProjetos;
	}

	public void setNumeroProjetos(short numeroProjetos) {
		if (this.numeroProjetos == 2) {
			System.out.println("O colaborador não pode fazer parte de mais um projeto");
		} else {
			this.numeroProjetos++;
		}
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
