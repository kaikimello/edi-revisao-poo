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

    public int contarAlunos(){
        Gensup gensup = new Gensup();
        Gemed gemed = new Gemed();
        return gensup.contarAlunos() + gemed.contarAlunos();
    }

}
