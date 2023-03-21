public class Aldeia {
    String nome;
    int qtdMoradore;
    String regiao;

    public Aldeia(String nome, int qtdMoradore, String regiao) {
        this.nome = nome;
        this.qtdMoradore = qtdMoradore;
        this.regiao = regiao;
    }

    Ninja[] ninjas = new Ninja[5];

    void adicionarNinja(Ninja ninja){
        for(int i =0;i<ninjas.length;i++){
            if (ninjas[i] == null){
                ninjas[i] = ninja;
                break;
            }
        }

    }

    void mostraInfo(){
        System.out.println("Aldeia: " + nome);
        System.out.println("Quantidade de moradores: " + qtdMoradore);
        System.out.println("Região: " + regiao);
        System.out.println("Ninjas: ");
        for (int i =0;i< ninjas.length;i++){
            if (ninjas[i] != null){
                System.out.println(ninjas[i].nome);

            }
        }

    }
    void rankingS(){
        System.out.println("Ninjas do ranking S: ");
        for (int i =0;i< ninjas.length;i++){
            if (ninjas[i] != null && ninjas[i].ranking.equals("S")){
                System.out.println(ninjas[i].nome);
            }
        }

    }

    void qtdTitulos(){
        int ninjasGe = 0;
        int ninjasChu = 0;
        int ninjasAN = 0;
        for (int i =0;i< ninjas.length;i++){
            if (ninjas[i] != null){
                if (ninjas[i].titulo.equals("Gennin")){
                    ninjasGe +=1;
                } else if (ninjas[i].titulo.equals("Chunnin")){
                    ninjasChu +=1;

                }else ninjasAN +=1;

            }
        }
        System.out.println("Quantidade de ninjas Gennin: ");
        System.out.println(ninjasGe);
        System.out.println("Quantidade de ninjas Chunnin: ");
        System.out.println(ninjasChu);
        System.out.println("Quantidade de ninjas ANBU: ");
        System.out.println(ninjasAN);
    }
}
