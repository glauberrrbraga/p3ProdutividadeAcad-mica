package com.prod.acad;

public class Estudante extends Colaborador {
	private String curso;
	private int numeroProjetos;

	public int getNumeroProjetos() {
		return numeroProjetos;
	}

	public void setNumeroProjetos() {

		this.numeroProjetos++;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
