package exercicio_05;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class TesteFibonacci {
    public static void main(String[] args) {
        Fibonacci numero = new Fibonacci();

        for (int i=0; i <10; i++){
            System.out.print(numero.calculaFibonacci(i) + " ");
        }
        System.out.println("\nA quantidade de chamadas do método foram: "+ numero.getQuantidadeChamada());
    }
}
