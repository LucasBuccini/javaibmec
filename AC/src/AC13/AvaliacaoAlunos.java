package AC13;

import java.util.Scanner;

public class AvaliacaoAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n_alunos, n_avaliacoes;
		double nota, perc_a, perc_r, aprov=0, reprov=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o numero de alunos: ");
		n_alunos = sc.nextInt();
		System.out.print("Qual o numero de avaliações: ");
		n_avaliacoes = sc.nextInt();
		
		double[][] sala = new double[n_alunos][n_avaliacoes];
		for(int i=0;i<sala.length;i++) {
			for(int j=0;j<sala[0].length;j++) {
				System.out.printf("Qual a nota do aluno %d na avaliação %d: ",(i+1),(j+1));
				nota=sc.nextDouble();
				sala[i][j] = nota;				
			}
		}
		for(int i=0;i<sala.length;i++) {
			double media = 0;
			for(int j=0;j<sala[0].length;j++) {
				media += sala[i][j];
			}
			media=media/n_avaliacoes;
			if(media<7) {
				System.out.println("=========================================");
				System.out.printf("Aluno %d reprovado: média igua a %.1f\n",(i+1),media);
				reprov+=1;
			}else {
				System.out.println("=========================================");
				System.out.printf("Aluno %d aprovado: média igua a %.1f\n",(i+1),media);
				aprov +=1;
			}
		}

		perc_a=(aprov/n_alunos);
		perc_r=(reprov/n_alunos);
		System.out.println("========================================="); 
		System.out.printf("Porcentagem de aprovados: %.2f",(perc_a*100));
		System.out.println("%");
		System.out.printf("Porcentagem de reprovados: %.2f",(perc_r*100));
		System.out.println("%");
	}
}
