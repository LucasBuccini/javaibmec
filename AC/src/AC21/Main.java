package AC21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String op;
		int n1,n2, escolha;
		double resposta;
		try {
			System.out.print("Escolha a operação:\n1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\nDigite o numero equivalente a operação: ");
			escolha = sc.nextInt();
			System.out.print("Qual o primeiro numero: ");
			n1 = sc.nextInt();
			System.out.print("Qual o segundo numero: ");
			n2 = sc.nextInt();
			switch(escolha) {
				case 1:
					resposta = n1 + n2;
					op = "soma";
					System.out.printf("O valor da %s é %.0f", op, resposta);
				case 2: 
					resposta = n1 - n2;
					op = "subtração";
					System.out.printf("O valor da %s é %.0f", op, resposta);
				case 3: 
					resposta = n1 * n2;
					op = "multiplicação";
					System.out.printf("O valor da %s é %.0f", op, resposta);
				case 4:
					resposta = n1/n2;
					op = "divisão";
					System.out.printf("O valor da %s é %.2f", op, resposta);
			}
			
		}catch(ArithmeticException e) {
			System.out.println("Erro: Divisão por zero");
		}catch(InputMismatchException e) {
			System.out.println("Erro: Numero invalido");
		}finally {
			sc.close();
		}
	}
}