public abstract class Astronalta {
    static int cont;

    private String cor;
    private String nome;
    Skin skin;
    Pet pet;

    public Astronalta(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
        cont++;
    }

    public static int getCont() {
        return cont;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Skin: " + skin.getTipo());
        System.out.println("Pet: " + pet.getNome());

    }

    public void verCameras() {
        System.out.println(nome + " olhou as cameras");
    }

    public abstract void reportar();

    public abstract void reparar();
}
