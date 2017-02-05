package com.prod.acad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;	
		Projeto[] projetos = new Projeto[100];
		String nome, email, aux;
		int quant = 0;
		double auxD;
		
		Scanner user = new Scanner(System.in);

		while (opcao != 12) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Adicionar um Projeto\n2: Adicionar um colaborador\n3: Consulta");	
			opcao = user.nextInt();
			switch(opcao){			
			case 1:
				System.out.println("Adicionar um Projeto.");
				projetos[quant] = new Projeto();
				System.out.print("Digite o titulo do projeto: ");
				projetos[quant].setTitulo(user.nextLine());
				projetos[quant].setTitulo(user.nextLine());
				System.out.print("Digite a data de incio do projeto, no formato (dd/MM/aaaa): ");
				projetos[quant].setDataInicio(user.nextLine());
				System.out.print("Digite a data de termino do projeto, no formato (dd/MM/aaaa): ");
				projetos[quant].setDataTermino(user.nextLine());
				System.out.print("Digite a agência financiadora do projeto: ");
				projetos[quant].setFinanciadora(user.nextLine());
				System.out.print("Digite o valor financiado: ");
				projetos[quant].setValorFinanciado(user.nextDouble());
				System.out.print("Digite o objetivo do projeto: ");
				projetos[quant].setObjetivo(user.nextLine());
				System.out.print("Digite a descrição do projeto: ");
				projetos[quant].setDescricao(user.nextLine());
				//Falta adicionar o metodo pra verificar professor etc etc				
				break;
			case 2:
				System.out.println("Adicionar um colaborador.");				
				System.out.println("Digite o nome: ");
				nome = user.nextLine();	
				nome = user.nextLine();		
				
				System.out.println("Digite o email: ");
				email = user.nextLine();
				projetos[quant].setNomeParticipante(nome, email);
				break;
			
			
			case 3:
				System.out.println("Consulta.\n1: Consulta de Projetos\n2: Consulta de Colaboradores");
				System.out.println("Por enquanto, o sistema só é capaz de fazer consulta no primeiro projeto.");
				System.out.println("Titulo do Projeto: " + projetos[quant].getTitulo());
				System.out.println("Inicio do Projeto: " + projetos[quant].getDataInicio());
				System.out.println("Termino do Projeto: " + projetos[quant].getDataTermino());
				System.out.println("Agencia financiadora: " + projetos[quant].getFinanciadora());
				System.out.println("Valor Financiado: " + projetos[quant].getValorFinanciado());
				System.out.println("Objetivo do Projeto: " + projetos[quant].getObjetivo());
				System.out.println("Descriçao do Projeto: " + projetos[quant].getDescricao());
				System.out.println("Participantes desse projeto:");
				for(int i = 0; i < projetos[quant].getParticipantes().size(); i++){
					System.out.println("Nome: " + projetos[quant].getParticipantes().get(i).getNome() + "\nEmail: " + projetos[quant].getParticipantes().get(i).getEmail() );
				}
				break;

		}
			

		}

	}

}
