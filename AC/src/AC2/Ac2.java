package AC2;
import java.util.Scanner;
public class Ac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double a,b,c,x1,x2,delta;
		System.out.print("Valor de a: ");
		a=teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Valor de b: ");
		b=teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Valor de c: ");
		c=teclado.nextDouble();
		teclado.nextLine();
		delta=(b*b)-4*a*c;
		x1=(-b + Math.sqrt(delta))/2*a;
		x2=(-b - Math.sqrt(delta))/2*a;
		
		System.out.println("Delta = "+delta);
		System.out.println("X1 = "+x1);
		System.out.println("X2 = "+x2);
	}

}
