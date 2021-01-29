package exercicio_06;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class Gensup extends DiretoriaGeral{

    private int qtdeCbsi, qtdeCele, qtdeCfis;

    public Gensup() {
    }

    @Override
    public int contarAlunos(DiretoriaGeral dg) {
        if (dg instanceof Cbsi){
            qtdeCbsi = dg.contarAlunos(dg);
            dg = new Cele();
        }else if(dg instanceof Cele){
            qtdeCele = dg.contarAlunos(dg);
            dg = new Cfis();
        }else if (dg instanceof  Cfis){
            qtdeCfis = dg.contarAlunos(dg);
            return (qtdeCbsi + qtdeCele + qtdeCfis);
        }else{
            dg = new Cbsi();
        }
        return contarAlunos(dg) ;
    }
}
