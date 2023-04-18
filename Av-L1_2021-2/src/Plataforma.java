public class Plataforma {
    String nome;
    String criador;
    Jogo[] jogos = new Jogo[10];


    void mostraInfo() {
        System.out.printf("Nome da plataforma : " + nome + "\n");
        System.out.printf("Nome do criador : " + criador + "\n");
        System.out.printf("Jogos : " + "\n");
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {
                System.out.println("-----------");
                jogos[i].mostraInfo();
                System.out.println("===========");
            }

        }
    }

    void adicionarJogo(Jogo novoJogo){
        for (int i = 0; i< jogos.length; i++){
            if (jogos[i] == null){
                jogos[i] = novoJogo;
                System.out.printf("jogo " + novoJogo.nome+ " adicionado!");
                break;
            }
        }
    }

    void mostrarMaisCaroBarato(){
        int mCaro = 0;
        int mBarado = 0;

        for (int i = 0; i < jogos.length; i++){
            if (jogos[i] != null){
                if (jogos[i].preco <= jogos[mBarado].preco){
                    mBarado = i;
                } else if (jogos[i].preco >= jogos[mCaro].preco) {
                    mCaro = i;
                }
            }
        }
        System.out.println("jogo mais barato: " +jogos[mBarado].nome + "\n");
        System.out.println("jogo mais caro: " +jogos[mCaro].nome + "\n");
    }

    void calculaDlc(){
        int ndlc = 0;
        for (int i = 0; i< jogos.length; i++){
            if (jogos[i] != null){
                if (jogos[i].dlc == true){
                    ndlc +=1;
                }
            }
        }
        System.out.printf(ndlc+" jogos possuem dlc"+ "\n");
    }
}
