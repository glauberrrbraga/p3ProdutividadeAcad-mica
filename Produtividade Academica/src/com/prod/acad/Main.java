package com.prod.acad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;	
		Projeto[] projetos = new Projeto[100];
		String nome, email;
		int quant = 0;
		
		Scanner user = new Scanner(System.in);
		projetos[quant] = new Projeto();

		while (opcao != 12) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Adicionar um colaborador\n2: Vizualizar colaboradores cadastrados");	
			opcao = user.nextInt();
			switch(opcao){			
			case 1:
				System.out.println("Adicionar um colaborador.");				
				System.out.println("Digite o nome: ");
				nome = user.nextLine();	
				nome = user.nextLine();		
				
				System.out.println("Digite o email: ");
				email = user.nextLine();
				projetos[quant].setNomeParticipante(nome, email);
				break;
			
			
			case 2:
				System.out.println("Vizualizar colaboradores cadastrados:");
				for(int i = 0; i < projetos[quant].getParticipantes().size(); i++){
					System.out.println("Nome: " + projetos[quant].getParticipantes().get(i).getNome() + "\nEmail: " + projetos[quant].getParticipantes().get(i).getEmail() );
				}
		}
			

		}

	}

}
