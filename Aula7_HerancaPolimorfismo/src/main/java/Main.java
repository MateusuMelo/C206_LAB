public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Arquiteto("creitin" ,20,2500,"Predial");
        funcionarios[1] = new Engenheiro("Jeferson",45,3000,"Eletrica");
        funcionarios[2] = new Professor("Jeremias",50,5000,"Exatas");

        for (int i = 0; i < funcionarios.length;i++){
            if (funcionarios[i] != null){
                if (funcionarios[i]instanceof Engenheiro){
                    Engenheiro engenheiro = (Engenheiro) funcionarios[i];
                    engenheiro.mostraInfo();
                } else if (funcionarios[i] instanceof Professor) {
                    Professor professor = (Professor)funcionarios[i];
                    professor.mostraInfo();
                }else{
                    Arquiteto arquiteto = (Arquiteto) funcionarios[i];
                    arquiteto.mostraInfo();
                }
            }
        }




    }
}
