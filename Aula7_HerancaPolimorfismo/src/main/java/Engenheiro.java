public class Engenheiro extends Funcionario {
    private String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override //conceito de polimorfismo
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Ramo do engenheiro:" + ramo);
    }
}
