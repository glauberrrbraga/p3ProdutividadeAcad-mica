package com.prod.acad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static boolean listarProfs() {
		if (!professores.isEmpty()) {
			System.out.println("Lista de professores cadastrados: ");
			for (i = 0; i < professores.size(); i++) {
				System.out.println(i + ": " + professores.get(i).getNome());
			}
			return true;
		} else {
			System.out.println("N�o h� professores cadastrados");
			return false;
		}
	}

	public static boolean listarEstu() {
		if (!estudantes.isEmpty()) {
			for (i = 0; i < estudantes.size(); i++) {
				System.out.println(i + ": " + estudantes.get(i).getNome());
			}
			return true;
		} else {
			System.out.println("N�o h� estudantes cadastrados");
			return false;
		}
	}
	
	public static void projDetalhados(){
		for (i = 0; i < quant; i++) {
			System.out.println("Titulo: " + projetos[i].getTitulo());
			System.out.println("Inicio: " + projetos[i].getDataInicio());
			System.out.println("Termino: " + projetos[i].getDataTermino());
			System.out.println("Agencia financiadora: " + projetos[i].getFinanciadora());
			System.out.println("Valor Financiado: " + projetos[i].getValorFinanciado());
			System.out.println("Objetivo: " + projetos[i].getObjetivo());
			System.out.println("Descri�ao: " + projetos[i].getDescricao());
			System.out.println("Status: " + projetos[i].getStatus());
			if (projetos[i].getEstParticipantes().isEmpty()) {
				System.out.println("N�o h� estudantes cadastrados nesse projeto.");
			} else {
				System.out.println("Estudantes cadastrados no projeto:");
				for (j = 0; j < projetos[i].getEstParticipantes().size(); j++) {
					System.out.println("Nome: " + projetos[i].getEstParticipantes().get(j).getNome()
							+ "\nEmail: " + projetos[i].getEstParticipantes().get(j).getEmail());
				}
			}
			if (projetos[i].getProfParticipantes().isEmpty()) {
				System.out.println("N�o h� professores cadastrados no projeto.");
			} else {

				System.out.println("Professores cadastrados desse projeto:");
				for (j = 0; j < projetos[i].getProfParticipantes().size(); j++) {
					System.out.println("Nome: " + projetos[i].getProfParticipantes().get(j).getNome()
							+ "\nEmail: " + projetos[i].getProfParticipantes().get(j).getEmail());
				}
			}
			System.out.println(
					"---------------------------------------------------------------------------------\n");
		}
	}

	public static void listarProj() {

		System.out.println("Projetos cadastrados no momento:");
		for (i = 0; i < quant; i++) {
			System.out.println(i + " - Nome: " + projetos[i].getTitulo());
		}
	}

	public static boolean isEmptyProj() {
		if (quant == 0)
			return true;
		else
			return false;
	}

	public static void adicionarProjeto() {
		System.out.println("Adicionar um Projeto.");
		projetos[quant] = new Projeto();
		System.out.print("Digite o titulo do projeto: ");
		projetos[quant].setTitulo(user.nextLine());
		projetos[quant].setTitulo(user.nextLine());
		System.out.print("Digite a data de incio do projeto, no formato (dd/MM/aaaa): ");
		projetos[quant].setDataInicio(user.nextLine());
		System.out.print("Digite a data de termino do projeto, no formato (dd/MM/aaaa): ");
		projetos[quant].setDataTermino(user.nextLine());
		System.out.print("Digite a ag�ncia financiadora do projeto: ");
		projetos[quant].setFinanciadora(user.nextLine());
		System.out.print("Digite o valor financiado: ");
		projetos[quant].setValorFinanciado(user.nextDouble());
		System.out.print("Digite o objetivo do projeto: ");
		projetos[quant].setObjetivo(user.nextLine());
		projetos[quant].setObjetivo(user.nextLine());
		System.out.print("Digite a descri��o do projeto: ");
		projetos[quant].setDescricao(user.nextLine());
		System.out.println("Nenhum aluno/professor esta associado ao projeto.");
		System.out.println("Projeto adicionado com sucesso.");
		System.out.println("----------------------------------------------------");
		quant++;
	}

	public static void editarProj() {
		System.out.println("Edi��o de Projeto de Pesquisa.");
		if (isEmptyProj()) {

			System.out.println("N�o h� projetos cadastrados.");

		} else {
			listarProj();

			System.out.print("Digite o projeto desejado: ");

			opcao = user.nextInt();

			if (projetos[opcao].getStatus() == "Concluido") {
				System.out.println("Voc� n�o pode editar um projeto concluido.");
			} else {
				System.out.print("1: Aloca��o de Participantes\n2: Altera��o de Status\n3:Associar uma publica��o\nDigite a op��o desejada: ");
				i = user.nextInt();
				if (i == 1) {
					if (projetos[opcao].getProfParticipantes().isEmpty() && !professores.isEmpty()) {
						System.out.println(
								"N�o h� professores associados nesse projeto.\nVoc� deve adicionar um antes de adicionar um estudante");
						listarProfs();
						System.out.print("Digite o codigo do professor desejado: ");
						j = user.nextInt();
						projetos[opcao].addProfessor(professores.get(j));
						System.out.println("Professor associado ao projeto " + projetos[opcao].getTitulo() + ".");
					} else {
						System.out.print("1: Alocar Professor; 2: Alocar Aluno\nDigite a op��o desejada: ");
						i = user.nextInt();

						if (i == 1 && !professores.isEmpty()) {
							listarProfs();
							j = user.nextInt();
							if (projetos[opcao].getProfParticipantes().contains(professores.get(j))) {
								System.out.println("Esse professor j� esta alocado neste projeto");
							} else {
								projetos[opcao].addProfessor(professores.get(j));
								System.out
										.println("Professor associado ao projeto " + projetos[opcao].getTitulo() + ".");
							}
						} else if (i == 1 && professores.isEmpty()) {
							System.out.println("N�o h� professores cadastrados.");
						} else if (i == 2 && !estudantes.isEmpty()) {
							listarEstu();
							j = user.nextInt();
							if (projetos[opcao].getEstParticipantes().contains(estudantes.get(j))) {
								System.out.println("Esse estudante j� esta alocado neste projeto.");
							} else {

								if (estudantes.get(j).getNumeroProjetos() == 2) {
									System.out.println("Esse estudante n�o pode fazer parte de mais de 2 projetos.");
								} else {
									projetos[opcao].addEstudante(estudantes.get(j));
									estudantes.get(j).setNumeroProjetos();
									System.out.println(
											"Estudante associado ao projeto " + projetos[opcao].getTitulo() + ".");
								}
							}

						} else if (i == 2 && estudantes.isEmpty()) {
							System.out.println("N�o h� estudantes cadastrados.");
						}
					}
				} else if (i == 2) {
					System.out.println("Altera��o de status:");
					if (!projetos[opcao].getEstParticipantes().isEmpty()
							&& !projetos[opcao].getProfParticipantes().isEmpty()
							&& projetos[opcao].getStatus() != "Em Andamento") {
						System.out.println("Status atual: " + projetos[opcao].getStatus());
						System.out.println("Status alterado para 'Em Andamento'");
						projetos[opcao].setStatus("Em Andamento");
					} else if (projetos[opcao].getEstParticipantes().isEmpty()
							&& !projetos[opcao].getProfParticipantes().isEmpty()) {
						System.out.println(
								"Voc� n�o pode alterar o status sem antes adicionar um estudante colaborador.");
					} else if (projetos[opcao].getEstParticipantes().isEmpty()
							&& projetos[opcao].getProfParticipantes().isEmpty()) {
						System.out.println("Status atual: " + projetos[opcao].getStatus());
						System.out.println(
								"Voc� n�o pode alterar o status sem antes adicionar um professor e/ou estudante como colaborador.");
					} else if (projetos[opcao].getPublicacoes().isEmpty()
							&& projetos[opcao].getStatus() == "Em Andamento") {
						System.out.println("Status atual: " + projetos[opcao].getStatus());
						System.out.println(
								"Voc� n�o pode alterar para 'Concluido', n�o h� publica��es associadas a esse projeto.");
					} else if (!projetos[opcao].getPublicacoes().isEmpty()
							&& projetos[opcao].getStatus() == "Em Andamento") {
						System.out.println("Status atual: " + projetos[opcao].getStatus());
						System.out.println("Status alterado para 'Concluido'");
						projetos[opcao].setStatus("Concluido");
						System.out.println("Voc� n�o pode mais fazer altera��es nesse projeto.");
					}

				}else if(i == 3){
					System.out.println("Op��o ainda n�o dispon�vel.");
				}

			}

		}

	}

	public static void adicionarColaborador() {
		System.out.print("Adicionar um colaborador.\n1: Professor; 2: Estudante\nDigite a opcao desejada: ");
		opcao = user.nextInt();
		if (opcao == 1) {
			Professor prof = new Professor();
			System.out.println("Adicionar um professor");
			System.out.print("Nome: ");
			prof.setNome(user.nextLine());
			prof.setNome(user.nextLine());
			System.out.print("Email: ");
			prof.setEmail(user.nextLine());
			System.out.println("A adi��o de orientandos � realizada em outra op��o.");
			professores.add(prof);
		} else if (opcao == 2) {
			Estudante estu = new Estudante();
			System.out.println("Adicionar um estudante");
			System.out.print("Nome: ");
			estu.setNome(user.nextLine());
			estu.setNome(user.nextLine());
			System.out.print("Email: ");
			estu.setEmail(user.nextLine());
			System.out.print("Curso: ");
			estu.setCurso(user.nextLine());
			estudantes.add(estu);
		}

	}
	
	public static void adicionarPublicacao(){
		if(!estudantes.isEmpty()){
			Publicacoes aux = new Publicacoes();		
			System.out.print("T�tulo: ");
			aux.setTitulo(user.nextLine());
			System.out.print("Conferencia onde foi publicada: ");
			aux.setConferencia(user.nextLine());
			System.out.print("Ano de publica��o: ");
			aux.setAnoPublicacao(user.nextInt());
			System.out.println("Voc� precisa associar um autor a essa publica��o.");
			listarEstu();
			System.out.print("Digite o c�digo do estudante que deseja associar: ");
			opcao = user.nextInt();
			aux.getAutores().add(estudantes.get(opcao));
			System.out.println("Publica��o adicionada.\nVoc� poder� associar essa publica��o a um projeto mais tarde.");			
		}else{
			System.out.println("N�o h� estudantes cadastrados, n�o � possivel adicionar uma publica��o.");
		}
		
		
		
	}

	public static Projeto[] projetos = new Projeto[100];
	public static Scanner user = new Scanner(System.in);
	static int quant = 0, i, j;
	public static ArrayList<Professor> professores = new ArrayList<Professor>();
	public static ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
	public static ArrayList<Publicacoes> publicacoes = new ArrayList<Publicacoes>();
	public static int opcao = 0;

	public static void main(String[] args) {

		while (opcao != 12) {
			System.out.println("Digite a op��o desejada: ");
			System.out.println("1: Adicionar um Projeto\n2: Associar Colaboradores ao sistema");
			System.out.println("3: Edi��o de projetos de pesquisa\n4: Colaboradores cadastrados");
			System.out.println("5: Projetos cadastrados");
			opcao = user.nextInt();
			switch (opcao) {
			case 1:
				adicionarProjeto();
				break;
			case 2:
				adicionarColaborador();
				break;
			case 3:
				editarProj();
				break;

			case 4:
				System.out.println("Colaboradores no sistema.");
				listarProfs();
				listarEstu();
				break;
			case 5:
				projDetalhados();
				break;
			case 6:
				System.out.println("Adicionar uma publica��o");
			default:
				System.out.println("Op��o inv�lida.");
				break;
					

			}

		}

	}

}
