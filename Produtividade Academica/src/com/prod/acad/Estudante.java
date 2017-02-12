package com.prod.acad;

public class Estudante extends Colaborador {
	private String curso;
	private int numeroProjetos;

	public int getNumeroProjetos() {
		return numeroProjetos;
	}

	public int setNumeroProjetos() {
		
		if (this.numeroProjetos == 2) {
			System.out.println("O colaborador não pode fazer parte de mais um projeto");
			return 0;
		} else{
			this.numeroProjetos++;
			return 1;
		}
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
