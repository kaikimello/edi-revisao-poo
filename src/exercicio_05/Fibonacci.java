package exercicio_05;

/**
 * Created by KAIKI on 25/01/2021, 2021
 */
public class Fibonacci {

    private int num;
    private int quantidadeChamada;

    public Fibonacci() {
        this.quantidadeChamada = 0;
    }

    public int getNum() {
        return num;
    }

    private void setNum(int num) {
        this.num = num;
    }

    public int getQuantidadeChamada() {
        return quantidadeChamada;
    }

    public void setQuantidadeChamada(int quantidadeChamada) {
        this.quantidadeChamada = quantidadeChamada;
    }

    public int calculaFibonacci(int num) {
        quantidadeChamada++;
        if (num == 0 || num ==1){
            return num;
        }

        return calculaFibonacci(num-1) + calculaFibonacci(num -2);
    }
}

/*
0 = 0
1 = 1
2 => f(2-1) + f(2-2)  = 1
     f(1) + F(0)
     1  +  0
3 => f(3-1) + f(3 - 2)  = 2
     f(2)          + f(1)
     f(2-1) + f(2-2)  + 1
     f(1) + f(0) + 1
     1 + 0 + 1
4 => f(4-1) + f(4-2)  = 3
     f(3)              + f(2)
     f(3-1) + f(3-2)   + f(2-1) + f(2-2)
     f(2)  + f(1)  + f(1) + f(0)
     f(2-1) + f(2-2)      +  1    + 1    + 0
     f(1) + f(0) + 1 + 1 + 0
     1   + 0 + 1 + 1 +0
*/


