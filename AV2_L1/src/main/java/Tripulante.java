public class Tripulante extends Astronalta implements Missao {
    private int qtdMissoes;

    public Tripulante(String cor, String nome, int qtdMissoes) {
        super(cor, nome);
        this.qtdMissoes = qtdMissoes;
    }

    public int getQtdMissoes() {
        return qtdMissoes;
    }

    public void setQtdMissoes(int qtdMissoes) {
        this.qtdMissoes = qtdMissoes;
    }

    @Override
    public void reportar() {
        System.out.println(super.getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(super.getNome()+" fez um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(super.getNome()+" fez uma missao");
    }
}
