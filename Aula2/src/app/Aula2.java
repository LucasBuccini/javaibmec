package app;
import java.util.Locale;
import java.util.Scanner;
public class Aula2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		double peso;
		char matricula;
		
		System.out.print("Inserir nome: ");
		nome = teclado.nextLine();
		System.out.print("Inserir idade: ");
		idade = teclado.nextInt();
		System.out.print("Inserir peso: ");
		peso = teclado.nextDouble();
		System.out.print("Inserir status da matricula: ");
		matricula = teclado.next().charAt(0);
		
		// Impressão
		System.out.println("-------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: "+idade);
		System.out.println("Peso: "+peso);
		System.out.println("Status da matricula: "+matricula);
		
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.equals(nome));
		
		System.out.println(Math.max(2,10));
		System.out.println(Math.sqrt(16));
		
	}
}