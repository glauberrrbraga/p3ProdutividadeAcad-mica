package com.prod.acad;

import java.util.ArrayList;

public class Professor extends Colaborador{
	ArrayList<Estudante> orientados;
	
	public Professor(){
		orientados = new ArrayList<Estudante>();
	}
	
	public ArrayList<Estudante> getOrientados() {
		return orientados;
	}

	public void setOrientados(Estudante estu) {
		this.orientados.add(estu);
	}

}
