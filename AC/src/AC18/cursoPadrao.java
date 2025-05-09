package AC18;
public class cursoPadrao extends Curso { 
    public cursoPadrao(String nome) {
        super(nome);
    }
    @Override
    public double calcularMedia(Aluno aluno) {
        double[] notas = aluno.getNotas();
        return (notas[0] + notas[1] + notas[2]) / 3.0;
    }
    @Override
    public boolean alunoAprovado(Aluno aluno) {
        double media = calcularMedia(aluno);
        int limiteFaltas = (int)(cargaHoraria * 0.25);
        return media >= 7.0 && aluno.getFaltas() <= limiteFaltas;
    }
}