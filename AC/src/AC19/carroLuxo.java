package AC19;

public class carroLuxo extends Carro {
    public carroLuxo(String descricao, double valor, int kmRodados) {
        super(descricao, valor, kmRodados);
    }
    @Override
    public double calcularDiaria() {
        double diaria = valor / 1000.0;
        return Math.min(diaria, 190.0);
    }
    @Override
    public String verificarKm() {
        if (kmRodados > KM_MAXIMO) {
            return "Carro deve ser enviado à concessionária (ultrapassou 50.000 km).";
        } else {
            return "Carro dentro dos padrões de uso.";
        }
    }
}