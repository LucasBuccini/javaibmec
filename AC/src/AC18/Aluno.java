package AC18;
public class Aluno {
    private String nome;
    private String registro;
    private double[] notas;
    private int faltas;
    public Aluno(String nome, String registro, double[] notas, int faltas) {
        this.nome = nome;
        this.registro = registro;
        this.notas = notas;
        this.faltas = faltas;
    }
    public String getNome() {
        return nome;
    }
    public String getRegistro() {
        return registro;
    }
    public double[] getNotas() {
        return notas;
    }
    public int getFaltas() {
        return faltas;
    }
}