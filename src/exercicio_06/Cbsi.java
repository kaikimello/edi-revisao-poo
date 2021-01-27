package exercicio_06;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class Cbsi extends Gensup{

    private int quantidadeAlunos;

    public Cbsi() {
        this.quantidadeAlunos = 150;
    }

    @Override
    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    @Override
    public int contarAlunos() {
        return this.getQuantidadeAlunos();
    }
}
