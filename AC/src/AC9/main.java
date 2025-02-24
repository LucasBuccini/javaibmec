package AC9;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cilindro c1 = new Cilindro();
		double raio, altura;
		System.out.print("Digite o raio do cilindro: ");
		raio = sc.nextDouble();
		System.out.print("Digite a altura do cilindro: ");
		altura = sc.nextDouble();
		c1.calcularArea(raio, altura);
		c1.calcularVolume(raio, altura);
	}

}
