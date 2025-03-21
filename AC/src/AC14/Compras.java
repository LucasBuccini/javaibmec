package AC14;

import java.util.ArrayList;
import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, parc,i=0;
		String nome;
		double valor, soma =0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> carrinho = new ArrayList<Produto>();
		do{
			System.out.print("Qual o nome do produto: ");
			nome = sc.nextLine();
			System.out.print("Qual o valor do produto: ");
			valor = sc.nextDouble();
			Produto p = new Produto(nome,valor);
			carrinho.add(p);
			sc.nextLine();
			System.out.print("0 para adicionar e 1 para sair: ");
			i=sc.nextInt();
			sc.nextLine();
		}while(i==0);
		System.out.print("Qual o numero de parcelas: ");
		parc = sc.nextInt();
		for(Produto p : carrinho) {
			soma += p.getValor();
			System.out.println("================================");
			System.out.printf("%s : R$%.2f\n",p.getNome(),p.getValor());
		}
		System.out.println("================================");
		System.out.printf("O valor final da compra foi de R$%.2f\n",soma);
		System.out.printf("Cada uma das %d parcelas custa R$%.2f",parc,(soma/parc));
		
	}
}
