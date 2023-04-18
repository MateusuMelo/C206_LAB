package Pokemons;

public abstract class Pokemon {
    public static int qtdPokemon;
    private String nome;
    private String tipo;
    public HeldItem helditem;

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        qtdPokemon++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        if (helditem !=null){
            System.out.println("Possui HeldItem de tipo : " + helditem.tipo);
        }else
            System.out.println("Nao possui HeldItem.");
    }
    public abstract void atacar();
}
