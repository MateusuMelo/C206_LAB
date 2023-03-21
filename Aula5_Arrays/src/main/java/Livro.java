public class Livro {

    String nome;
    int paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public void mostraInfo() {
        System.out.println("Nome do livro: "+ this.nome);
        System.out.println("Numero de paginas: "+ this.paginas);
    }
}
