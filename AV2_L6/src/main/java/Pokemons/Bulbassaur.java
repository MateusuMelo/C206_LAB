package Pokemons;

import Pokemons.Interfaces.AtaqueEspecial;
import Pokemons.Interfaces.FazerBarulho;

import java.lang.reflect.AnnotatedType;

public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial {
    private float luminosidadeAmbiente;

    public Bulbassaur(String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        if (helditem != null){
            luminosidadeAmbiente += 300;
        }
        System.out.println("Poder especial: luminosidade ambiente");
        System.out.println("Poder luminosidade ambiente: "+ luminosidadeAmbiente);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " esta atacando!");
    }

    @Override
    public void ataqueEspecial() {

        if (luminosidadeAmbiente > 650){
            System.out.println(getNome() + " venceu a batalha");
        }else
            System.out.println(getNome() + " perdeu a batalha");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " esta fazendo barulho!");

    }
}
