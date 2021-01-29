package exercicio_06;

/**
 * Created by KAIKI on 27/01/2021, 2021
 */
public class Coed extends Gemed{
    private int quantidadeAlunos;

    public Coed(){
        this.quantidadeAlunos = 20;
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
