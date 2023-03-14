public class Nave {
    String nome;
    int velocidade;
    boolean velLuz;

    Arma arma;
    public Nave(String nome, int velocidade, boolean velLuz,String tipo,int forca) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velLuz = velLuz;
        this.arma = new Arma(tipo,forca);

        System.out.println("Nave gerada");
    }

    public void mostrainfo() {
        System.out.println("Nome da nave: " + nome);
        System.out.println("Velocidade da nave: " + velocidade);
    }

    public void viajarVLuz() {
        if (velLuz == true) {
            System.out.println("Viajando na velocidade da luz");
        } else System.out.println("Não esta na velocidade da luz");
    }

    public void addArma(Arma arma){
        System.out.println("Arma foi adicionada");
        this.arma = arma;

    }
}
