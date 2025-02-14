package AC1;
import java.util.Scanner;

public class AC1 {
	public static void main(String[] args) {
	
		Scanner teclado= new Scanner(System.in);
		System.out.print("Nome do funcionario 1: ");
		String nome1 = teclado.nextLine();
		System.out.print("Salario do funcionario 1: ");
		double sal1 = teclado.nextDouble();	
		System.out.print("Nome do funcionario 2: ");
		teclado.nextLine();
		String nome2 = teclado.nextLine();
		System.out.print("Salario do funcionario 2: ");
		double sal2 = teclado.nextDouble();		
		teclado.nextLine();
		System.out.print("Nome do funcionario 3: ");
		String nome3 = teclado.nextLine();
		System.out.print("Salario do funcionario 3: ");
		double sal3 = teclado.nextDouble();
		
		System.out.printf("O(a) funcionario(a) 1 chama %s, e recebe R$ %.2f \n", nome1,sal1 );
		System.out.printf("O(a) funcionario(a) 2 chama %s, e recebe R$ %.2f \n", nome2,sal2 );
		System.out.printf("O(a) funcionario(a) 3 chama %s, e recebe R$ %.2f \n", nome3,sal3 );
		double media = (sal1+sal2+sal3)/3;
		System.out.printf("A media de salários é de R$ %.2f",media);
	}
}