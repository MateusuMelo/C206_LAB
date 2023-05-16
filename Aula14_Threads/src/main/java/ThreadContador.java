public class ThreadContador implements Runnable {
    String nome;

    public ThreadContador(String nome) {
        this.nome = nome;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.nome + " " + i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
