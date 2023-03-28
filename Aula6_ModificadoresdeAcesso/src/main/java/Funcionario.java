public class Funcionario {
    private static int qtdFunc;
    int id;
    String nome;
    private int salario;

    public Funcionario(String nome, int salario){
        qtdFunc++;
        this.nome = nome;
        this.id=qtdFunc;
        this.salario = salario;
    }

    void mostraInfo(){
        System.out.println("nome: " + nome);
        System.out.println("id: " + id);
    }

    public static int getQtdFunc() {
        return qtdFunc;
    }

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
