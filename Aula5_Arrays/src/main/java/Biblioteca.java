import java.util.Scanner;

public class Biblioteca {
    String nome;
    Livro[] livros = new Livro[10];

    public Biblioteca(String nome) {
        this.nome = nome;
        System.out.println("Biblioteca " + this.nome + " criada.");
    }

    public void mostrainfo() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                livros[i].mostraInfo();
            }
        }
    }

    public void addLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                System.out.println(livro.nome + " adicionado.");
                break;
            }
        }
    }

    public void start() {
        boolean flag = true;
        Scanner op = new Scanner(System.in);

        do {
            System.out.println("Bem vindo a biblioteca " + this.nome);
            System.out.println("1 - para cadastradar um livro");
            System.out.println("2 - para ver todos os livros");
            System.out.println("3 - para sair");

               int opcao = op.nextInt();

                switch (opcao) {
                    case 1:

                        System.out.println("Insira o nome do livro e em seguida o numero de paginas");
                        Scanner nome = new Scanner(System.in);
                        Scanner pag = new Scanner(System.in);

                        Livro l1 = new Livro(nome.nextLine(), pag.nextInt());
                        this.addLivro(l1);

                        break;

                    case 2:
                        this.mostrainfo();
                        break;

                    case 3:
                        flag = false;
                        break;

                    default:
                        System.out.println("Essa não é uma opção.");
                        break;
                }
                op.nextLine();
        } while (flag);
        op.close();
    }
}
