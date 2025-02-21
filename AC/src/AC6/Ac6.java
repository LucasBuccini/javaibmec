package AC6;
import java.util.Scanner;
public class Ac6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String senha= "J@vaPOO", tentativa;
		Scanner teclado = new  Scanner(System.in);
		int x=3;
		while(x>0) {
			System.out.print("Digite a senha: ");
			tentativa = teclado.nextLine();
			if(tentativa==senha) {
				System.out.println("Senha correta");
				break;
			}else {
				System.out.printf("Tentativa %d incorreta, tente novamente.\n",4-x);
				x--;
			}
		}
		if(x==0){
			System.out.println("Você excedeu o limite máximo de tentativas");
		}
		
	}
}


