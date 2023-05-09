package Main;

import Exercicio1.Funcionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Exercicio1.Arquivo arq = new Exercicio1.Arquivo();

        Exercicio1.Funcionarios f1 = new Exercicio1.Funcionarios();
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Bem vindo ao menu");
            System.out.println("1 - cadastrar cliente");
            System.out.println("2 - listar cliente");
            System.out.println("3 - sair");

            switch (in.nextInt()) {
                case 1:
                    System.out.println("cadastrando ");
                    in.nextLine();
                    f1.setNome(in.nextLine());
                    f1.setCpf(in.nextLine());
                    f1.setIdade(in.nextInt());
                    arq.escrever(f1);
                    break;
                case 2:
                    ArrayList<Funcionarios> func = arq.ler();
                    Collections.sort(func);
                    for (int i = 0; i<func.size() ; i++) {
                        System.out.println(func.get(i).getNome());
                        System.out.println(func.get(i).getCpf());
                        System.out.println(func.get(i).getIdade());
                    }
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    }
}
