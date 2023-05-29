import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo() {
            @Override
            public void escrever(Jogo jogo) {
                Arquivo.super.escrever(jogo);
            }

            @Override
            public ArrayList ler() {
                return Arquivo.super.ler();
            }
        };

        Scanner entrada = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("1 - Para cadastrar um novo jogo");
            System.out.println("2 - Ler jogos salvos");
            System.out.println("3 - Mostrar jogos pelo mais barato");
            System.out.println("4 - Mostrar jogos pelo mais caro");
            System.out.println("0 ou qualquer tecla - Sair");

            switch (entrada.nextInt()) {
                case 1:
                    String nome;
                    String gen;
                    double val;
                    entrada.nextLine();
                    try {
                        System.out.println("Insira o nome do jogo");
                        nome = entrada.nextLine();

                        System.out.println("Insira o Genero do jogo");
                        gen = entrada.nextLine();

                        System.out.println("Insira o valor do jogo");
                        val = entrada.nextDouble();
                        if (val >= 0)
                            entrada.nextLine();
                        else
                            throw new PrecoNegativoException("Preço não valido");
                    } catch (PrecoNegativoException e) {
                        e.printStackTrace();
                        break;
                    }
                    Jogo game = new Jogo(nome, val, gen);

                    arquivo.escrever(game);
                    System.out.println("JOGO CADASTRADO COM SUCESSO!");
                    break;

                case 2:
                    ArrayList leitura = arquivo.ler();
                    for (int i = 0; i < leitura.size(); i++) {
                        Jogo game_leitura = (Jogo) leitura.get(i);
                        System.out.println(game_leitura.getNome());
                        System.out.println(game_leitura.getGenero());
                        System.out.println(game_leitura.getPreco());
                    }
                    break;

                case 3:
                    ArrayList leitura_crescente = arquivo.ler();
                    Collections.sort(leitura_crescente);
                    for (int i = 0; i < leitura_crescente.size(); i++) {
                        Jogo game_crescente = (Jogo) leitura_crescente.get(i);
                        System.out.println(game_crescente.getNome());
                        System.out.println(game_crescente.getGenero());
                        System.out.println(game_crescente.getPreco());
                    }
                    break;
                case 4:
                    ArrayList leitura_decrescente = arquivo.ler();
                    Collections.sort(leitura_decrescente);
                    Collections.reverse(leitura_decrescente);
                    for (int i = 0; i < leitura_decrescente.size(); i++) {
                        Jogo game_decrescente = (Jogo) leitura_decrescente.get(i);
                        System.out.println(game_decrescente.getNome());
                        System.out.println(game_decrescente.getGenero());
                        System.out.println(game_decrescente.getPreco());
                    }
                    break;
                default:
                    flag = false;
                    break;

            }
        } while (flag);
    }
}
