package exercicio_06;

/**
 * Created by KAIKI on 27/01/2021, 2021
 */
public class Cele extends Gensup{

    private int quantidadeAlunos;

    public Cele() {
        this.quantidadeAlunos = 50;
    }

    @Override
    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    @Override
    public int contarAlunos(DiretoriaGeral dg) {
        return getQuantidadeAlunos();
    }
}
