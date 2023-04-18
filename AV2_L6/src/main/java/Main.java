import Pokemons.*;
import Treinador.Treinador;

public class Main {
    public static void main(String[] args) {
        HeldItem ak47 = new HeldItem("Metralhadora automatica 7.62");

        Pokemon[] pokemons = new Pokemon[3];

        pokemons[0] = new Squirtle("Squirtle", "Agua", 300);
        pokemons[1] = new Pikachu("Pikachu", "Eletrico", 500, 300);
        pokemons[2] = new Bulbassaur("Bulbassaur", "terra", 600);

        pokemons[2].helditem = ak47;
        Treinador ash = new Treinador("Ash");

        ash.addPokemon(pokemons[0]);
        ash.addPokemon(pokemons[1]);
        ash.addPokemon(pokemons[2]);

        //Mostrando todos pokemons do Ash(não sei se escreve dessa forma)
        System.out.println("==============POKEMONS DO ASH =============");
        for (int i = 0; i < ash.getPokemons().length; i++) {
            if (ash.getPokemons()[i] != null) {
                if (ash.getPokemons()[i] instanceof Pikachu) {
                    Pikachu pk = (Pikachu) ash.getPokemons()[i];
                    pk.mostraInfo();
                    pk.atacar();
                    pk.ataqueEspecial();
                    pk.fazerBarulho();

                } else if (ash.getPokemons()[i] instanceof Bulbassaur) {
                    Bulbassaur bul = (Bulbassaur) ash.getPokemons()[i];
                    bul.mostraInfo();
                    bul.atacar();
                    bul.ataqueEspecial();
                    bul.fazerBarulho();
                } else {
                    Squirtle sq = (Squirtle) ash.getPokemons()[i];
                    sq.mostraInfo();
                    sq.atacar();
                    sq.fazerBarulho();
                }
                System.out.println("\n");
            }

        }

        System.out.println("Foram criados "+ Pokemon.qtdPokemon + " pokemons.");
    }
}
