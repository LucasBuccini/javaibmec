package AC16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Livro> lista_livros = new ArrayList<Livro>();
		Autor a1 = new Autor();
		int num_liv;
		System.out.print("Qual o nome do autor: ");
		a1.setNome(sc.nextLine());
		System.out.print("Qual o cpf do autor: ");
		a1.setCpf(sc.nextLine());
		System.out.print("Quantos livros o autor tem: ");
		num_liv = sc.nextInt();
		sc.nextLine();
		
		for(int x =0; x<num_liv;x++) {
			Livro l = new Livro();
			System.out.printf("Qual o nome do %d° livro: ",(x+1));
			l.setNome_livro(sc.nextLine());
			System.out.printf("Qual o numero de paginas do %d° livro: ",(x+1));
			l.setNumero_paginas(sc.nextInt());
			sc.nextLine();
			System.out.printf("Qual a descrição do %d° livro: ",(x+1));
			l.setDescricao(sc.nextLine());
			lista_livros.add(l);
		}
		a1.setLivro(lista_livros);
		
		System.out.printf("\nO autor %s tem os seguintes livros: \n",a1.getNome());
		for(Livro l: a1.getLivro()) {
			System.out.println("================================");
			System.out.println(l.getNome_livro());
			System.out.printf("Numero de paginas: %d\n",l.getNumero_paginas());
			System.out.println(l.getDescricao());
			System.out.println("================================");
		}
	}

}
