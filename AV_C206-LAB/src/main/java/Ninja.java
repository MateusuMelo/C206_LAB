public class Ninja {
    String nome;
    int idade;
    String titulo;
    String ranking;

    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    void mostraInfo(){
        System.out.println("Nome do ninja: ");
        System.out.println(nome);

        System.out.println("Idade do ninja: ");
        System.out.println(idade);

        System.out.println("Titulo do ninja: ");
        System.out.println(titulo);

        System.out.println("Ranking do ninja: ");
        System.out.println(ranking);
    }
}
