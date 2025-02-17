package AC4;
import java.util.Scanner;
public class Ac4 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String aluno, status;
		double prova1, prova2, faltas, media, presenca;
		System.out.print("Nome do aluno: ");
		aluno = teclado.nextLine();
		System.out.print("Nota da prova 1: ");
		prova1 = teclado.nextDouble();
		System.out.print("Nota da prova 2: ");
		prova2= teclado.nextDouble();
		System.out.print("Número de faltas: ");
		faltas = teclado.nextDouble();
		media=(prova1+prova2)/2;
		presenca=100-((faltas/40)*100);
		if(presenca>=75 && media>=7) {
			status= "Aprovado";
		}else {
			status="Reprovado";
		}
		System.out.printf("O aluno(a) %s foi %s, com a media de %.1f",aluno,status,media);
	}
}
