package exercicio_06;

/**
 * Created by KAIKI on 27/01/2021, 2021
 */
public class Cfis extends Gensup{
    private int quantidadeAlunos;

    public Cfis(){
        this.quantidadeAlunos = 50;
    }

    @Override
    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    @Override
    public int contarAlunos() {
        return getQuantidadeAlunos();
    }
}
