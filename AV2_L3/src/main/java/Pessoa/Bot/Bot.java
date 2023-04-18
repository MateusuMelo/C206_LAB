package Pessoa.Bot;

import Pessoa.Pessoa;

public class Bot extends Pessoa implements Interacao {
    private Boolean hostil;

    public Bot(String nome, Boolean hostil) {
        super(nome);
        this.hostil = hostil;
    }

   @Override
   public void mostraInfo(){
        super.mostraInfo();
   }
    @Override
    public void fazMissao() {
        if (hostil == true){
            System.out.println("Ajudou o jogador a fazer a missão");
        }else
            System.out.println("Atrapalhou o jogador a fazer a missão");
    }

    @Override
    public void passarMissao() {
        if (hostil == true){
            System.out.println("Este Bot não passa missões");
        }else
            System.out.println("Este Bot passa missões");
    }
}
