package com.prod.acad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;	
		Projeto[] projetos = new Projeto[100];
		String nome, email, aux;
		int quant = 0;
		ArrayList<Professor> professores = new ArrayList<Professor>(); //Tem que salvar uma copia de todos os colaboradores participantes
		ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
		ArrayList<Publicacoes> publicacoes = new ArrayList<Publicacoes>();
		


		
		Scanner user = new Scanner(System.in);

		while (opcao != 12) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Adicionar um Projeto\n2: Associar Colaboradores ao sistema\n3: Associar colaboradores a projetos\n4: Consulta de colaboradores");	
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
				System.out.println("Adicionar um colaborador.\n 1: Professor; 2: Estudante");
				opcao = user.nextInt();
				if(opcao == 1){
					Professor prof = new Professor();
					
					System.out.println("Adicionar um professor");
					System.out.print("Digite o nome: ");		
					prof.setNome(user.nextLine());
					prof.setNome(user.nextLine());
					System.out.print("Digite o email do professor: ");
					prof.setEmail(user.nextLine());
					System.out.println("A adição de orientandos é realizada em outra opção.");
					professores.add(prof);					
				}else if(opcao == 2){
					Estudante estu = new Estudante();
					System.out.println("Adicionar um estudante");
					System.out.print("Digite o nome: ");		
					estu.setNome(user.nextLine());
					estu.setNome(user.nextLine());
					System.out.print("Digite o email: ");
					estu.setEmail(user.nextLine());
					System.out.print("Digite o curso: ");
					estu.setCurso(user.nextLine());	
					estudantes.add(estu);
				}
				
				break;
			case 3:
				System.out.println("Associar um colaborador a um projeto.");
				System.out.println("Essa opcão ainda nao esta disponivel.");
				break;
			
			
			case 5:
				
				
				System.out.println("Consulta.\n\nPor enquanto, o sistema só é capaz de fazer consulta no primeiro projeto.\n");
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
				System.out.println("Alunos participantes desse projeto:");
				for(int i = 0; i < projetos[quant].getEstParticipantes().size(); i++){
					System.out.println("Nome: " + projetos[quant].getEstParticipantes().get(i).getNome() + "\nEmail: " + projetos[quant].getEstParticipantes().get(i).getEmail() );
				}
				break;
			case 4:
				System.out.println("Colaboradores no sistema.");
				System.out.println("Estudantes:");
				for(int i = 0; i < estudantes.size(); i++){
					System.out.println("Nome: " + estudantes.get(i).getNome() + "\nEmail: " + estudantes.get(i).getEmail() );					
				}
				System.out.println("Professores:");
				for(int i = 0; i < professores.size(); i++){
					System.out.println("Nome: " + professores.get(i).getNome() + "\nEmail: " + professores.get(i).getEmail() );					
				}
				
				break;

		}
			

		}

	}

}
