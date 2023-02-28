import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variaveis sempre com letras minusculas
        //double saldoDaConta;
        //double Saldo_Da_Poupanca; //snake case

        //constantes com letra maiusculas
        //int VALOR = 10;

        /*============================== casting ======================================
        double numDouble = 1.54;
        float numFloat;

        numFloat = (float) numDouble;
        ==============================================================================*/


        /*======================= Entradas ===========================================
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um numero double");
        double numDouble = entrada.nextDouble();

        System.out.println("Entre com um numero float");
        float numFloat = entrada.nextFloat();

        System.out.println("Entre com um numero int");
        int numInt = entrada.nextInt();

        entrada.nextLine(); // Entrada entre numeros e strings.

        System.out.println("Entre com seu nome");
        String nome = entrada.nextLine();

    ==================================================================================*/

        // Exercicio
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira sua altura");
        float altura = entrada.nextFloat();

        System.out.println("insira seu peso");
        int peso = entrada.nextInt();

        double imc = (peso/Math.pow(altura,2));

        if (imc >= 40.0){
            System.out.println("Obesidade grau 3");
        } else if (imc >= 35){
            System.out.println("Obesidade grau 2");
        } else if (imc >=30){
            System.out.println("Obesidade grau 1");
        } else if (imc >= 25){
            System.out.println("Sobrepeso");
        } else if (imc >= 18.5) {
            System.out.println("Peso Normal");
        } else System.out.println("Abaixo do Peso");

        System.out.println("Seu imc: " + imc);
        entrada.close();
    }
}
