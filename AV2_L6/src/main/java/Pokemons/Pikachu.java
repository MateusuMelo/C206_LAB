package Pokemons;

import Pokemons.Interfaces.AtaqueEspecial;
import Pokemons.Interfaces.FazerBarulho;

public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial {
    private float soltarRaios;
    private float paralisiaEletrica;

    public Pikachu(String nome, String tipo, float soltarRaios, float paralisiaEletrica) {
        super(nome, tipo);
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;
        if (this.helditem != null){
            soltarRaios += 300;
        }
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        if (helditem != null){
            soltarRaios += 200;
        }
        System.out.println("Ataques especiais: soltar raio, paralisia eletrica ");
        System.out.println("Poder de ataque soltar raio: " + soltarRaios);
        System.out.println("Poder de ataque paralisia eletrica: " + paralisiaEletrica);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " esta atacando!");
    }

    @Override
    public void ataqueEspecial() {
        if (soltarRaios > 750){
            System.out.println(getNome() + " venceu a batalha");
        }else
            System.out.println(getNome() + " perdeu a batalha");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " esta fazendo barulho!");

    }
}
