package exercicio_03;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class TesteNumerosInteirosDES {
    public static void main(String[] args) {
        NumeroInteiroDES numero = new NumeroInteiroDES();
        numero.setNum(10);
        System.out.println(numero.mostrarValorDes());
        System.out.println("_______________________");
        System.out.println("Quantidade de chamadas: "+ numero.getQuatidadeChamadas());
    }
}
