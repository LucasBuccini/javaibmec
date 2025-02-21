package AC7;
import java.util.Scanner;
public class Ac7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome, porc;
		porc="%";
		double preco, desc, precfinal, escolha;
		while(true) {
			System.out.print("Qual o nome do produto: ");
			nome = teclado.nextLine();
			System.out.print("Qual o preço do produto: ");
			preco = teclado.nextDouble();
			System.out.print("Qual o desconto em porcentagem do produto: ");
			desc = teclado.nextDouble();
			precfinal= preco - (preco * (desc/100));
			System.out.printf("O produto %s tem o preço inicial de R$%.2f, "
					+ "mas com o desconto de %.0f%s o seu preço final é de R$%.2f.\n",nome,preco,desc,porc,precfinal);
			teclado.nextLine();
			System.out.print("Digite 1 para continuar ou 2 para sair: ");
			escolha = teclado.nextDouble();
			if(escolha==2) {
				break;
			}
			teclado.nextLine();
			
			
		}
	}

}
