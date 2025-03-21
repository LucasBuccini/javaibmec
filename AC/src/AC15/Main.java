package AC15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			Comprador c1 = new Comprador();
			Ingresso i = new Ingresso();
			System.out.println("Qual o nome do cliente: ");
			c1.setNome(sc.nextLine());
			System.out.println("Qual o cpf do cliente: ");
			c1.setCpf(sc.nextLine());
			System.out.println("Qual o numero do ingresso comprado: ");
			i.setNum(sc.nextInt());
			sc.nextLine();
			System.out.println("Qual a descrição do ingresso: ");
			i.setDescricao(sc.nextLine());
			c1.setIngresso(i);
			
			System.out.printf("O cliente %s de cpf %s comprou o ingresso %d para o %s\n", c1.getNome(),c1.getCpf(),i.getNum(),i.getDescricao());

	}

}
