public class Jogo {
    String nome;
    String genero;
    double preco;
    boolean dlc;

    public Jogo(String nome,String genero,double preco, boolean dlc){
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
    }

    void mostraInfo(){
        System.out.printf("Nome: " + nome + "\n");
        System.out.printf("Genero: " + genero+ "\n");
        System.out.printf("Preo: " + preco+ "\n");
        if (dlc == true){
            System.out.printf("Possui dlc"+ "\n");
        }else System.out.printf("Não possui dlc"+ "\n");
    }

}
