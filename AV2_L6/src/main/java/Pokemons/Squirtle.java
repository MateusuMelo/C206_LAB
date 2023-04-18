package Pokemons;

import Pokemons.Interfaces.FazerBarulho;

public class Squirtle extends Pokemon implements FazerBarulho {
    private float multiplicadorAgua;

    public Squirtle(String nome, String tipo, float multiplicadorAgua) {
        super(nome, tipo);
        this.multiplicadorAgua = multiplicadorAgua;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Poder multiplicador de agua" + multiplicadorAgua);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " esta atacando!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " esta fazendo barulho!");

    }
}
