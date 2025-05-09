package AC19;

public abstract class Carro {
    protected String descricao;
    protected double valor;
    protected int kmRodados;
    protected final int KM_MAXIMO = 50000;
    public Carro(String descricao, double valor, int kmRodados) {
        this.descricao = descricao;
        this.valor = valor;
        this.kmRodados = kmRodados;
    }
    public abstract double calcularDiaria();
    public abstract String verificarKm();
    public void exibirRelatorio() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor do carro: R$" + valor);
        System.out.println("KM rodados: " + kmRodados);
        System.out.printf("Valor da diária: R$%.2f\n", calcularDiaria());
        System.out.println("Situação: " + verificarKm());
        System.out.println("-----------------------------------");
    }
}