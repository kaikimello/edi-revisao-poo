package exercicio_06;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class Gemed extends DiretoriaGeral{

    @Override
    public int contarAlunos() {
        Coinf coinf = new Coinf();
        Coed coed = new Coed();
        return coinf.contarAlunos() + coed.contarAlunos();
    }
}
