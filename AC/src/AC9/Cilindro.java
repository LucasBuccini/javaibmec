package AC9;

public class Cilindro {
	public double raio, altura, area, volume;
	
	public void calcularArea(double raio, double altura) {
		area = 2*Math.PI*raio*altura;
		System.out.printf("A area do cilindro é de %.2f",area);
	}

	public void calcularVolume(double raio, double altura) {
		volume = Math.PI*raio*raio*altura;
		System.out.printf("O volume do cilindro é de %.2f",volume);
	}
}
