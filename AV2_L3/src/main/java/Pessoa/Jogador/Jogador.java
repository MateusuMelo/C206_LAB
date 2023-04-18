package Pessoa.Jogador;

import Pessoa.Pessoa;

public class Jogador extends Pessoa implements Recuperar, Loja {
    private int nivel;
    private Boolean passeBatalha;
    private int vida;
    private int escudo;
    public Skin skin;
    public Mochila mochila;

    public Jogador(String nome, int nivel, Boolean passeBatalha, int vida, int escudo) {
        super(nome);
        this.nivel = nivel;
        this.passeBatalha = passeBatalha;
        this.vida = vida;
        this.escudo = escudo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Boolean getPasseBatalha() {
        return passeBatalha;
    }

    public void setPasseBatalha(Boolean passeBatalha) {
        this.passeBatalha = passeBatalha;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        if (skin != null) {
            System.out.println("====Informações da Skin ====");
            System.out.println("Nome da skin: " + skin.getNome());
            System.out.println("Raridade da skin: " + skin.getRaridade());
        }else
            System.out.println("O jogador não possui Skin!");
        if (mochila != null){
            System.out.println("====Informações da Mochila ====");
            System.out.println("Raridade da mochila: " + mochila.getRaridade());
        }else
            System.out.println("O jogador não possui Mochila");
    }

    @Override
    public void fazMissao() {
        System.out.println(getNome() + " completou uma missao!");
        setNivel(getNivel() + 1);
    }

    @Override
    public void gastarVbucks() {
        System.out.println("Gastou V Bucks na loja");
    }
    @Override
    public void comprarVbucs() {
        System.out.println("Comprou V Bucks na loja");
    }

    @Override
    public void recuperarVida() {
        if (vida <= 100){
            vida +=15;
        }else
            System.out.println("O jogador ja esta com vida maxima!");
    }

    @Override
    public void recuperarEscudo() {
        if (escudo <= 100){
            escudo +=25;
        }else
            System.out.println("O jogador ja esta com escudo maximo!");

    }
}
