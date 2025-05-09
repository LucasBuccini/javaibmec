package AC19;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new carroBasico("Fiat Uno", 40000.0, 52000);
        Carro carro2 = new carroLuxo("BMW Série 3", 180000.0, 48000);
        carro1.exibirRelatorio();
        carro2.exibirRelatorio();
    }
}