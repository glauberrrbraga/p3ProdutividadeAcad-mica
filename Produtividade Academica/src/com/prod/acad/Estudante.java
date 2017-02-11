package com.prod.acad;

public class Estudante extends Colaborador {
	private String curso;
	private int numeroProjetos;

	public int getNumeroProjetos() {
		return numeroProjetos;
	}

	public int setNumeroProjetos() {
		this.numeroProjetos++;
		if (this.numeroProjetos >= 2) {
			System.out.println("O colaborador não pode fazer parte de mais um projeto");
			this.numeroProjetos--;
			return 0;
		} else return 1;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
