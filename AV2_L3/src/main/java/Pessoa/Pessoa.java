package Pessoa;

public abstract class Pessoa {
   public static int qtdPessoas = 0;
    private String nome;

    public Pessoa(String nome) {
        qtdPessoas++;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
    }
    public abstract void fazMissao();
}
