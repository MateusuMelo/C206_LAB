public class Main {
    public static void main(String[] args) {
        Astronalta[] astronaltas = new Astronalta[3];
        astronaltas[0] = new Tripulante("ciano", "jefersson",10);
        astronaltas[1] = new Tripulante("branco", "julio",10);
        astronaltas[2] = new Impostor("vermelho","giulia");

        //adicionando pets
        astronaltas[0].pet = new Pet("ratinho");
        astronaltas[0].skin = new Skin("Faxineiro");
        astronaltas[1].pet = new Pet("borboleta");
        astronaltas[1].skin = new Skin("frentista");
        astronaltas[2].pet = new Pet("bolha");
        astronaltas[2].skin = new Skin("comunista");


        System.out.println("Estão a bordo: " + Astronalta.getCont() + " astronaltas.");

        //acões tripulantes
        System.out.println("=================Ações tripulante 1========================");
        Tripulante t1 = (Tripulante)astronaltas[0];
        t1.mostraInfo();
        t1.verCameras();
        t1.reportar();
        t1.reparar();
        t1.fazerMissao();

        System.out.println("=================Ações tripulante 2========================");
        Tripulante t2 = (Tripulante)astronaltas[1];
        t2.mostraInfo();
        t2.verCameras();
        t2.reportar();
        t2.reparar();
        t2.fazerMissao();

        //acoes impostor

        System.out.println("=================Ações impostor========================");
        Impostor imp = (Impostor)astronaltas[2];
        imp.usarVentoinha();
        imp.trancaPortas("cozinha");
        imp.sabotarLuz();
        imp.sabotarOxigenio();
        imp.sabotarComunicacao();
        imp.sabotarReator();
        imp.executar();
        imp.mostraInfo();
        System.out.println("matou "+imp.getQtdMortes());



    }
}
