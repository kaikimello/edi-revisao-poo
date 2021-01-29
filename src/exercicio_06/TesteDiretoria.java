package exercicio_06;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class TesteDiretoria {
    public static void main(String[] args) {
        DiretoriaGeral diretoriaGeral = new DiretoriaGeral();
        System.out.println("A quantidade de alunos do Campus é: "+ diretoriaGeral.contarAlunos(diretoriaGeral));
    }
}
