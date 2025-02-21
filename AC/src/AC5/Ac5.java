package AC5;
import java.util.Scanner;


public class Ac5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double num1, num2, res;
		char op;
		res=0;
		System.out.print("Digite o numero 1: ");
		num1 = teclado.nextDouble();
		System.out.print("Digite o numero 2: ");
		num2 = teclado.nextDouble();
		System.out.print("*: para multiplicar.\n/: para dividir.\n+: para somar.\n-: para subtrair.\nEscolha: ");
		teclado.nextLine();
		op = teclado.nextLine().charAt(0);
		if(op=='/' && num2==0) {
			System.out.println("Operação invalida, não é possivel fazer divisão por 0.");
		}else {
			if(op=='*'){
				res=num1 * num2;
			}else if(op=='/') {
				res=num1/num2;
			}else if(op=='+') {
				res=num1+num2;
			}else if(op=='-') {
				res=num1-num2;
			}
			System.out.printf("A operação feita foi %.2f %c %.2f\n",num1,op,num2);
			System.out.printf("O resultado foi %.2f",res);
		}
	}

}
