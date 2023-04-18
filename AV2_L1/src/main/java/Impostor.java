public class Impostor extends Astronalta implements Missao, Sabotar, Executar{
    private int qtdMortes = 0;

    public Impostor(String cor, String nome) {
        super(cor, nome);
    }

    public int getQtdMortes() {
        return qtdMortes;
    }

    public void setQtdMortes(int qtdMortes) {
        this.qtdMortes = qtdMortes;
    }

    void usarVentoinha(){
        System.out.println("O impostor se escondedu na ventilacao");
    }
    void trancaPortas(String local){
        System.out.println("O impostor trancou as portdas do local: " + local);
    }

    @Override
    public void reportar() {
        System.out.println(super.getNome() + " fez um self report");
    }

    @Override
    public void reparar() {
        System.out.println(super.getNome()+" fingiu um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(super.getNome()+" fez uma falsa missao");
    }

    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o Oxigenio");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a comunicacao");
    }

    @Override
    public void executar() {
        System.out.println(super.getNome() + " Matou um tripulante");
        qtdMortes++;
    }
}
