package AC10;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula);

        System.out.print("Digite a nota da Avaliação 1: ");
        double a1 = scanner.nextDouble();

        System.out.print("Digite a nota da Avaliação 2: ");
        double a2 = scanner.nextDouble();

        System.out.print("Digite a nota da Atividade Complementar: ");
        double ac = scanner.nextDouble();

        aluno.setNotas(a1, a2, ac);

        if (aluno.getMedia() < 7) {
            System.out.print("Digite a nota da Avaliação Substitutiva: ");
            double as = scanner.nextDouble();
            aluno.setAvaliacaoSubstitutiva(as);
        }

        aluno.imprimirResultado();
        scanner.close();
    }
}