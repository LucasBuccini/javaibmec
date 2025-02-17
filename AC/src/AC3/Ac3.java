package AC3;
import java.util.Scanner; 

public class Ac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		double raio, altura, area, volume;
		System.out.print("Valor do raio: ");
		raio = teclado.nextDouble();
		System.out.print("Valor da altura: ");
		altura = teclado.nextDouble();
		area = 2*Math.PI*raio*(raio+altura);
		volume = Math.PI*raio*raio*altura;
		System.out.printf("O valor da area do cilindro é de %.2f unidades de medida.\n",area);
		System.out.printf("O valor do volume do cilindro é de %.2f unidades de medida.\n", volume);
	}

}
