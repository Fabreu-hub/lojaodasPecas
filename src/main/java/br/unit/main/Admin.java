package br.unit.main;

import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
Scanner leTeclado = new Scanner(System.in);
		
		int opcao; int opcaoCliente; int opcaoVendedor;
		
		do{
			System.out.println("Digite a opção desejada: "
					+ "1 - Cliente "
					+ "2 - Vendedor "
					+ "3 - Sair ");
			opcao = leTeclado.nextInt();
			if (opcao == 1) {
				System.out.println("O que você deseja fazer: "
						+ "1 - Cadastrar Cliente "
						+ "2 - Editar Cliente "
						+ "3 - Excluir Cliente");
				opcaoCliente = leTeclado.nextInt();
			
				if (opcaoCliente == 1) {
					System.out.println("-- CADASTRAR CLIENTE --");
					
					
				}
				if (opcaoCliente == 2) {
					System.out.println("-- EDITAR DADOS DO CLIENTE --");
				}
				if (opcaoCliente == 3) {
					System.out.println("-- EXCLUIR CLIENTE --");
				}
			
			}
			if (opcao == 2) {
				System.out.println("O que você deseja fazer: "
						+ "1 - Cadastrar dados do vendedor "
						+ "2 - Atualizar dados do vendedor "
						+ "3 - Excluir dados do vendedor ");
				opcaoVendedor = leTeclado.nextInt();
				
				if (opcaoVendedor == 1) {
					System.out.println("-- CADASTRAR VENDEDOR --");
				}
				if (opcaoVendedor == 2) {
					System.out.println("-- ATUALIZAR DADOS DO VENDEDOR --");
					
				}
				if (opcaoVendedor == 3) {
					System.out.println("-- EXCLUIR VENDEDOR --");
					
				}
				
			}
			
		}while (opcao != 3);
		
	System.out.println("Obrigado!");

	}

}
