package com.prod.acad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		Projeto[] projetos = new Projeto[100];
		String nome, email, aux;
		int quant = 0, i, j;
		ArrayList<Professor> professores = new ArrayList<Professor>(); 
		ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
		ArrayList<Publicacoes> publicacoes = new ArrayList<Publicacoes>();

		Scanner user = new Scanner(System.in);

		while (opcao != 12) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Adicionar um Projeto\n2: Associar Colaboradores ao sistema");
			System.out.println("3: Edição de projetos de pesquisa\n4: Colaboradores cadastrados");
			System.out.println("5: Projetos cadastrados");
			opcao = user.nextInt();
			switch (opcao) {
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
				quant++;
				break;
			case 2:
				System.out.println("Adicionar um colaborador.\n 1: Professor; 2: Estudante");
				opcao = user.nextInt();
				if (opcao == 1) {
					Professor prof = new Professor();

					System.out.println("Adicionar um professor");
					System.out.print("Digite o nome: ");
					prof.setNome(user.nextLine());
					prof.setNome(user.nextLine());
					System.out.print("Digite o email do professor: ");
					prof.setEmail(user.nextLine());
					System.out.println("A adição de orientandos é realizada em outra opção.");
					professores.add(prof);
				} else if (opcao == 2) {
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
				System.out.println("Edição de Projeto de Pesquisa.");
				if (quant == 0) {
					System.out.println("Não há projetos cadastrados no momento.");
				} else {
					System.out.println("Projetos cadastrados no momento:");
					for (i = 0; i < quant; i++) {
						System.out.println(i + " - Nome: " + projetos[i].getTitulo());
					}
					System.out.print("Digite o projeto desejado: ");
					opcao = user.nextInt();
					System.out.print("1: Alocação de Participantes\n2: Alteração de Status: ");
					if (i == 1) {
						if (projetos[opcao].getProfParticipantes().isEmpty() && !professores.isEmpty()) {
							System.out.println(
									"Não há professores associados nesse projeto. Você deve adicionar um antes de adicionar um estudante");
							System.out.println("Lista de professores cadastrados: ");
							for (i = 0; i < professores.size(); i++) {
								System.out.println(
										i + ": " + professores.get(i).getNome());
							}
							j = user.nextInt();
							projetos[opcao].addProfessor(professores.get(j));
							System.out.println("Professor associado ao projeto " + projetos[opcao].getTitulo() + ".");							
						}
						else{
							System.out.print("Adicionar 1: Professor ou 2: Aluno: ");
							i = user.nextInt();
							if(i == 1 && !professores.isEmpty()){
								System.out.println("Lista de professores cadastrados: ");
								for (i = 0; i < professores.size(); i++) {
									System.out.println(
											i + ": " + professores.get(i).getNome());
								}
								j = user.nextInt();
								projetos[opcao].addProfessor(professores.get(j));
								System.out.println("Professor associado ao projeto " + projetos[opcao].getTitulo() + ".");	
							}else if(i == 2 && !estudantes.isEmpty()){
								System.out.println("Lista de estudantes cadastrados: ");
								for (i = 0; i < estudantes.size(); i++) {
									System.out.println(
											i + ": " + estudantes.get(i).getNome());
								}
								j = user.nextInt();
								projetos[opcao].addEstudante(estudantes.get(j));
								System.out.println("Estudante associado ao projeto " + projetos[opcao].getTitulo() + ".");	
								
							}
							
						}
					
					}

				}
				break;

			case 5:

				for(i = 0; i < quant; i++)
				{
					System.out.println("Titulo do Projeto: " + projetos[i].getTitulo());
					System.out.println("Inicio do Projeto: " + projetos[i].getDataInicio());
					System.out.println("Termino do Projeto: " + projetos[i].getDataTermino());
					System.out.println("Agencia financiadora: " + projetos[i].getFinanciadora());
					System.out.println("Valor Financiado: " + projetos[i].getValorFinanciado());
					System.out.println("Objetivo do Projeto: " + projetos[i].getObjetivo());
					System.out.println("Descriçao do Projeto: " + projetos[i].getDescricao());
					System.out.println("Professores participantes desse projeto:");
					
					for (j = 0; j < projetos[i].getProfParticipantes().size(); j++) {
						System.out.println("Nome: " + projetos[i].getProfParticipantes().get(j).getNome() + "\nEmail: "
								+ projetos[i].getProfParticipantes().get(j).getEmail());
					}
					System.out.println("Alunos participantes desse projeto:");
					for (j = 0; j < projetos[i].getEstParticipantes().size(); j++) {
						System.out.println("Nome: " + projetos[i].getEstParticipantes().get(j).getNome() + "\nEmail: "
								+ projetos[j].getEstParticipantes().get(i).getEmail());
					}
					System.out.println("---------------------------------------------------------------------------------\n");
				}
				
				break;
			case 4:
				System.out.println("Colaboradores no sistema.");
				System.out.println("Estudantes:");
				for (i = 0; i < estudantes.size(); i++) {
					System.out.println(
							i + ": " + estudantes.get(i).getNome() + "\nEmail: " + estudantes.get(i).getEmail());
				}
				System.out.println("Professores:");
				for (i = 0; i < professores.size(); i++) {
					System.out.println(
							i + ": " + professores.get(i).getNome() + "\nEmail: " + professores.get(i).getEmail());
				}
				
				break;

			}

		}

	}

}
