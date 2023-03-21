import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aldeia folha = new Aldeia("Folha",1500,"Suave");
        Ninja[] ninjas = new Ninja[5];
        int nNija = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("=======Cadastrando Aldeia...=======");
        System.out.println("Insira o nome da aldeia");
        String nomealdeia = entrada.nextLine();

        System.out.println("Quantidade de moradores");
        int qntmoradores = entrada.nextInt();

        entrada.nextLine();
        System.out.println("Regiao: ");
        String regiao = entrada.nextLine();

        Aldeia ald = new Aldeia(nomealdeia,qntmoradores,regiao);
        System.out.println("-------Aldeia Cadastrada!");

        System.out.println("======Menu da aldeia=======");

        boolean flag_menu = true;
        do {
            System.out.println("Insira 1 para cadastrar um ninja na aldeia");
            System.out.println("Insira 2 para mostrar informaçoes dos ninjas e da aldeia");
            System.out.println("Insira 3 para mostrar os ninjas com ranking S");
            System.out.println("Insira 4 para mostrar quantidade de ninjas");
            System.out.println("Insira 0 para sair" + "\n");

            switch (entrada.nextInt()){
                case 1:
                    System.out.println("Insira o nome do ninja");
                    entrada.nextLine();
                    String nomeninja = entrada.nextLine();

                    System.out.println("Insira a idade do ninja");
                    int idadeNinja = entrada.nextInt();

                    entrada.nextLine();
                    System.out.println("Insira o titulo do ninja");
                    String tituloninja = entrada.nextLine();

                    System.out.println("Insira o ranking do ninja");
                    String rankingninja = entrada.nextLine();

                    ninjas[nNija] = new Ninja(nomeninja,idadeNinja,tituloninja,rankingninja);
                    ald.adicionarNinja(ninjas[nNija]);
                    System.out.println("Ninja adicionado na aldeia!");
                    nNija+=1;
                    break;
                case 2:
                    ald.mostraInfo();
                    break;
                case 3:
                    ald.rankingS();
                    break;
                case 4:
                    ald.qtdTitulos();
                    break;
                case 0:
                    flag_menu = false;
                    break;
                default:
                    System.out.println("Essa não é uma opção valida tente alguma das opções acima.");
            }

        }while (flag_menu);


    }
}
