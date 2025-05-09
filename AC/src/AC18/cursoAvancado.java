package AC18;
public class cursoAvancado extends Curso { 
    public cursoAvancado(String nome) {
        super(nome);
    }
    @Override
    public double calcularMedia(Aluno aluno) {
        double[] notas = aluno.getNotas();
        return (notas[0] * 3 + notas[1] * 5 + notas[2] * 2) / 10.0;
    }
    @Override
    public boolean alunoAprovado(Aluno aluno) {
        double media = calcularMedia(aluno);
        int limiteFaltas = (int)(cargaHoraria * 0.10);
        return media >= 7.0 && aluno.getFaltas() <= limiteFaltas;
    }
}