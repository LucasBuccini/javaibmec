package AC19;

public class carroBasico extends Carro {
    public carroBasico(String descricao, double valor, int kmRodados) {
        super(descricao, valor, kmRodados);
    }
    @Override
    public double calcularDiaria() {
        return valor / 2000.0;
    }
    @Override
    public String verificarKm() {
        if (kmRodados > KM_MAXIMO) {
            return "Carro deve ser enviado para revisão (ultrapassou 50.000 km).";
        } else {
            return "Carro dentro dos padrões de uso.";
        }
    }
}