public class Main {
    public static void main(String[] args) {
        ThreadContador t1 = new ThreadContador("Thread 1");
        ThreadContador t2 = new ThreadContador("Thread 2");
        ThreadContador t3 = new ThreadContador("Thread 3");

        Thread tt1 =new Thread(t1);
        Thread tt2 =new Thread(t2);
        Thread tt3 =new Thread(t3);
        tt1.start();
        tt2.start();
        tt3.start();
    }
}
