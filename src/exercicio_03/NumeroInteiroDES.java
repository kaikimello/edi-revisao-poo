package exercicio_03;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class NumeroInteiroDES {
    private int num;
        private int quatidadeChamadas;

    public NumeroInteiroDES() {
        this.quatidadeChamadas=0;
    }

    public int getQuatidadeChamadas() {
        return quatidadeChamadas;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int mostrarValorDes(){
        quatidadeChamadas++;
        if(num == 1){
            return 1;
        }
        System.out.println(getNum());
        this.num--;
        return mostrarValorDes();
    }
}
