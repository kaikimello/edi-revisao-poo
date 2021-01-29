package exercicio_06;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class Coinf extends Gemed{
    private int quantidadeAlunos;

    public Coinf(){
        this.quantidadeAlunos = 10;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    @Override
    public int contarAlunos(DiretoriaGeral dg) {
        return getQuantidadeAlunos();
    }
}
