package AC11;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numerodealunos;
		System.out.print("Digite o numero de alunos: ");
		numerodealunos = sc.nextInt();
		double [] notas = new double[numerodealunos];
		double soma = 0, media;
		for(int i = 0;i<notas.length;i++) {
			System.out.print("Nota da avaliação "+(i+1));
			notas[i] = sc.nextDouble();
			soma = soma + notas [i];
		}
		media=soma/notas.length;
		for(int i = 0;i<notas.length;i++) {
			System.out.println("Nota " + (i+1)+": " + notas[i]);
		}
		
		System.out.printf("Média final: %.2f",media);
	}

}
