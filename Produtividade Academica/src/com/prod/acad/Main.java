package com.prod.acad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;	
		Projeto[] projetos = new Projeto[100];
		String nome, email, aux;
		int quant = 0;
		
		Scanner user = new Scanner(System.in);

		while (opcao != 12) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Adicionar um Projeto\n2: Associar Colaboradores a Projetos\n3: Consulta");	
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
				projetos[quant].setObjetivo(user.nextLine());
				System.out.print("Digite a descrição do projeto: ");
				projetos[quant].setDescricao(user.nextLine());
				System.out.print("Nenhum aluno/professor foi associado ao projeto.");
				break;
			case 2:
				System.out.println("Associar um colaborador.\n 1: Professor; 2: Estudante");
				System.out.println("Por enquanto, o sistema só é capaz de associar colaboradores no primeiro projeto.");
				opcao = user.nextInt();
				if(opcao == 1){
					System.out.println("Adicionar um professor");
					projetos[quant].addProfessor();	
				}else if(opcao == 2){
					System.out.println("Adicionar um estudante");
					projetos[quant].addEstudante();	
				}
				
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
				System.out.println("Professores participantes desse projeto:");
				for(int i = 0; i < projetos[quant].getProfParticipantes().size(); i++){
					System.out.println("Nome: " + projetos[quant].getProfParticipantes().get(i).getNome() + "\nEmail: " + projetos[quant].getProfParticipantes().get(i).getEmail() );
				}
				break;

		}
			

		}

	}

}
