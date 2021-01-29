package exercicio_06;

/**
 * Created by KAIKI on 26/01/2021, 2021
 */
public class DiretoriaGeral {

    private String nome;
    private int quantidadeAlunos;

    public DiretoriaGeral() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    private void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int contarAlunos(DiretoriaGeral dg){
        if (dg instanceof Gensup){
            quantidadeAlunos = dg.contarAlunos(dg);
            dg = new Gemed();
        }else if (dg instanceof Gemed){
            quantidadeAlunos += dg.contarAlunos(dg);
            return quantidadeAlunos;
        }else {
            dg = new Gensup();
        }
        return contarAlunos(dg) /*+ gemed.contarAlunos()*/;
    }

}
