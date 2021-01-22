package exercicio_01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by KAIKI on 14/01/2021, 2021
 */
public class ValoresInteiros {

    private int[] valor;
    private int tamanho;
    private int indice;
    private boolean primeiraVez;
    private boolean arquivoCriado;

    public ValoresInteiros() {
        this.indice = 0;
        this.tamanho = 5;
        this.primeiraVez = true;
        this.arquivoCriado = false;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice() {
        this.indice++;
    }

    public int[] getValor() {
        return valor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setValor(int valor) {
        if(primeiraVez){
            this.valor = new int[getTamanho()];
            primeiraVez=false;
        }
        int cont = getIndice();
        this.valor[cont] = valor;
        setIndice();
    }

    public void informarValor(){
        Scanner input = new Scanner(System.in);
        int numero;
        for (int i=0; i < this.getTamanho(); i++){
            System.out.print("Informe o valor: "+ (i + 1) + " ");
            numero = input.nextInt();
            setValor(numero);
        }
        System.out.println("O arquivo foi criado ? "+ criarArquivo(getValor()));
    }

    public boolean criarArquivo(int[] valor){
        File arquivo = new File("arquivo_inteiros.txt");
        try {
            arquivoCriado  = arquivo.createNewFile();
            preencherArquivo(arquivo, valor);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arquivoCriado;
    }

    private void preencherArquivo(File arquivo, int[] valor) {
        try {
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter escritor = new BufferedWriter(fw);
            for(int numero : valor){
                String conteudo = Integer.toString(numero);
                escritor.write(conteudo + " ");
            }
            escritor.flush();
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ValoresInteiros{"+ Arrays.toString(valor) +"}";
    }
}
