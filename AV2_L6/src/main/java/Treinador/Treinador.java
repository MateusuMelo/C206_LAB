package Treinador;

import Pokemons.Pokemon;

public class Treinador {
    private String nome;
    private Pokemon[] pokemons = new Pokemon[10];

    public Treinador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public void addPokemon(Pokemon p){
        for (int i = 0; i< pokemons.length;i++){
            if (pokemons[i]==null){
                pokemons[i] = p;
                System.out.println("Pokemon adicionado!");
                break;
            }
        }
    }
    public void mostraInfo(){
        System.out.println("=========Informações Treinador============");
        System.out.println("Nome " +nome);
        System.out.println("==========Informaçoes dos pokemons");
        for (int i=0;i< pokemons.length;i++){
            if (pokemons[i]!=null){
                pokemons[i].mostraInfo();
            }
        }
    }
}
