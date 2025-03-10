package AC12;

import java.util.Scanner;

public class MediaTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numalunos, numavaliacoes, soma = 0, nota;
		double mediaturma;
		System.out.print("Qual o numero de alunos da turma: ");
		numalunos = sc.nextInt();
		System.out.print("Qual o numero de avaliações da turma: ");
		numavaliacoes = sc.nextInt();
		double[][] turma = new double[numavaliacoes][numalunos];
		
		for(int i = 0; i<turma.length; i++) {
			for(int j = 0; j<turma[0].length;j++) {
				System.out.print("Inserir a nota do aluno "+(j+1)+", na avaliação "+(i+1)+": ");
				nota=sc.nextInt();
				turma[i][j]=nota;
				soma +=nota;
			}
		}
		for(int i = 0; i<turma.length; i++) {
			System.out.print("[");
			for(int j = 0; j<turma[0].length;j++) {
				System.out.print(turma[i][j]+", ");
			}
			System.out.print("]");
			System.out.print("\n");
		}
		
		mediaturma=soma/(turma.length+turma[0].length);
		System.out.printf("A media da turma foi de %.2f",mediaturma);
	}

}
