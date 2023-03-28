public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Jeremias",1000);
        Funcionario f2 = new Funcionario("Jucilopes",2000);
        Funcionario f3 = new Funcionario("Kenedy",3000);
        Funcionario f4 = new Funcionario("Adalberto",4000);

        System.out.println(Funcionario.getQtdFunc());
        System.out.println(f4.getSalario());

        f4.setSalario(3000);

        System.out.println(f4.getSalario());

    }
}
