package exercicio_04;

/**
 * Created by KAIKI on 25/01/2021, 2021
 */
public class NumeroInteiroASC {

    private int numero;
    private int quantidadeChamadas;

    public NumeroInteiroASC() {
        quantidadeChamadas = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidadeChamadas() {
        return quantidadeChamadas;
    }

    public int mostrarValorRecursivo(){
        quantidadeChamadas++;
        if(this.getNumero() == 10){
            return 10;
        }
        System.out.println(this.numero);
        this.numero++;
        return mostrarValorRecursivo();
    }
}
