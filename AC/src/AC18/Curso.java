package AC18;
public abstract class Curso {
    protected String nome;
    protected int cargaHoraria = 80;
    public Curso(String nome) {
        this.nome = nome;
    }
    public abstract boolean alunoAprovado(Aluno aluno);
    public abstract double calcularMedia(Aluno aluno);
}