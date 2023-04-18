import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plataforma plat =new Plataforma();;
        boolean plataforma_ja_criada = false;
        boolean flag = false;
        do {
            System.out.printf("------Menu de cadastro------"+"\n");
            System.out.printf("1 - para criar sua plataforma" + "\n");
            System.out.printf("2 - para mostrar informações da sua plataforma"+ "\n");
            System.out.printf("3 - para mostrar os jogos mais baratos e mais caros"+ "\n");
            System.out.printf("4 - para mostrar os jogos que possuem dlc"+ "\n");
            System.out.printf("5 - para encerrar"+ "\n");



            Scanner menu = new Scanner(System.in);

            switch (menu.nextInt()) {
                case 1:
                    if (plataforma_ja_criada == false) {
                        plataforma_ja_criada = true;

                        menu.nextLine();

                        System.out.println("insira o nome da sua plataforma");
                        String nome = menu.nextLine();
                        System.out.println("insira o nome do criador");
                        String criador = menu.nextLine();
                        plat.nome = nome;
                        plat.criador = criador;

                        System.out.printf("Adicione um jogo"+ "\n");
                        Jogo[] jogos = new Jogo[10];

                            int loop = 0;
                            int flag1 = 1;
                        do {
                            System.out.printf("Nome do jogo"+ "\n");
                            String jname = menu.nextLine();


                            System.out.printf("Genero"+ "\n");
                            String genero = menu.nextLine();

                            System.out.printf("Preço do jogo"+ "\n");
                            double preco = menu.nextDouble();
                            menu.nextLine();

                            System.out.printf("Possui dlc?"+ "\n");
                            boolean dlc = menu.nextBoolean();

                            jogos[loop] = new Jogo(jname, genero, preco, dlc);
                            plat.adicionarJogo(jogos[loop]);
                            loop++;

                            System.out.printf("Deseja adicionar mais jogos?"+ "\n");
                            System.out.printf("1 - Sim"+ "\n");
                            System.out.printf("2 - Não"+ "\n");
                            flag1 = menu.nextInt();
                            menu.nextLine();

                        } while (flag1 == 1);

                    } else System.out.printf("Ja existe uma plataforma!");
                    break;

                case 2:
                    plat.mostraInfo();
                    break;

                case 3:
                    plat.mostrarMaisCaroBarato();
                    break;

                case 4:
                    plat.calculaDlc();
                    break;

                case 5:
                    flag = true;
                    break;

                default:
                    System.out.printf("Esta não é uma opção valida");

            }

        } while (flag == false);

    }
}