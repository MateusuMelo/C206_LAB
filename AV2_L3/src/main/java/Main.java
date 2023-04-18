import Pessoa.Jogador.Mochila;
import Pessoa.Jogador.Skin;
import Pessoa.Pessoa;
import Pessoa.Jogador.Jogador;
import Pessoa.Bot.Bot;

public class Main {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = new Jogador("Jacinto", 20, false, 100, 30);
        pessoas[1] = new Bot("Claudio", true);



        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] instanceof Jogador) {
                System.out.println("Jogador: " + pessoas[i].getNome());
                Jogador jogador = (Jogador) pessoas[i];
                //adicionando skin e mochila ao jogador
                jogador.skin = new Skin("Thannos","Epica");
                jogador.mochila = new Mochila("lendaria");
                System.out.println("================== ações do jogador ================");
                jogador.mostraInfo();
                jogador.comprarVbucs();
                jogador.fazMissao();
                jogador.gastarVbucks();
                jogador.recuperarEscudo();
                jogador.recuperarVida();


            } else if (pessoas[i] instanceof Bot) {
                Bot bot = (Bot) pessoas[i];
                System.out.println("================== ações do Bot ================");
                System.out.println("Bot: " + pessoas[i].getNome());
                bot.mostraInfo();
                bot.fazMissao();
                bot.passarMissao();
            }
        }
        System.out.println("Ha no servidor " + Pessoa.qtdPessoas +" pessoas");

    }
}
