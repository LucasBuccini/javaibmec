package AC20;
public class Aluno {
    private String nome;
    private int matricula;
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aluno)) return false;
        Aluno outro = (Aluno) obj;
        return this.matricula == outro.matricula;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(matricula);
    }
    @Override
    public String toString() {
        return "Aluno: " + nome + ", Matrícula: " + matricula;
    }
}