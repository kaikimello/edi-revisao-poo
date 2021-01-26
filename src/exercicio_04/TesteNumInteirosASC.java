package exercicio_04;

/**
 * Created by KAIKI on 25/01/2021, 2021
 */
public class TesteNumInteirosASC {
    public static void main(String[] args) {
        NumeroInteiroASC numero = new NumeroInteiroASC();
        numero.setNumero(1);
        System.out.println(numero.mostrarValorRecursivo());
        System.out.println("-----------------------------");
        System.out.println("A quantidade de chamadas é: "+ numero.getQuantidadeChamadas());
    }
}
