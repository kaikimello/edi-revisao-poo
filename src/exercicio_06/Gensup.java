package exercicio_06;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class Gensup extends DiretoriaGeral{

    public Gensup() {
    }

    @Override
    public int contarAlunos() {
        Cbsi cbsi = new Cbsi();
        Cele cele = new Cele();
        Cfis cfis = new Cfis();
        return cbsi.contarAlunos() + cele.contarAlunos() + cfis.contarAlunos() ;
    }
}
