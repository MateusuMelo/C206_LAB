public class Professor extends Funcionario {
    private String materias;

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Materias do professor: " + materias);
    }
    public void corrigirProvas(){
        System.out.println("O professor " + getNome() + " corrigiu as provas.");
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        corrigirProvas();
    }
}
