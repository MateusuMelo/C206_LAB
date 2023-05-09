import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        ArrayList listaItens = new ArrayList();
        ArrayList <Conta>contas = new ArrayList<>();
        ArrayList<Integer> arrayInteiro = new ArrayList<>(); //transformando array para homogeneo(apenas 1 tipo)

        Conta c1 = new Conta("jeremias", 1900);
        Conta c2 = new Conta("juliano", 400);
        Conta c3 = new Conta("giulia", 5600);
        listaItens.add(c1);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        arrayInteiro.add(100);
        arrayInteiro.add(200);
        arrayInteiro.add(50);
        arrayInteiro.add(80);
        arrayInteiro.remove(arrayInteiro.indexOf(200));
        System.out.println(arrayInteiro.get(0));

        Collections.sort(arrayInteiro);
        Collections.reverse(arrayInteiro); //reverter ordem do array

        Collections.sort(contas);

    }
}
