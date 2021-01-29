package exercicio_06;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class Gemed extends DiretoriaGeral{
    private int qtdeCoinf, qtdeCoed;

    @Override
    public int contarAlunos(DiretoriaGeral dg) {
        if(dg instanceof Coinf){
            qtdeCoinf = dg.contarAlunos(dg);
            dg = new Coed();
        }else if(dg instanceof Coed){
            qtdeCoed = dg.contarAlunos(dg);
            return (qtdeCoinf + qtdeCoed);
        }else{
            dg = new Coinf();
        }
        return contarAlunos(dg);
    }
}
