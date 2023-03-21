import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[] arrayint = {10,20,30,40,50,60,70,80,90,100}; //array do tipo inteiro
        //System.out.println(arrayint[2]);

        /*
        Livro[] livros = new Livro[10];

        Livro l1 = new Livro("Diario de um Banana", 400);
        livros[0] = l1;

        livros[1] = new Livro("jogos vorazes", 300);

        for (int i = 0; i < 2; i++) {
            livros[i].mostraInfo();
        }
         */
        Biblioteca b1 = new Biblioteca("Amazon");

        b1.start();

    }
}
