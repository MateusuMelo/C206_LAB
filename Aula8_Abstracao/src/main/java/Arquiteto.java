public class Arquiteto extends Funcionario { //estends  = herda
    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override //conceito de polimorfismo
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialidade do arquiteto : " + especialidade);
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O arquiteto esta planejando");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 700;
    }

    @Override
    public void gerencia() {

    }
}
