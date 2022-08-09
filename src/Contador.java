public class Contador implements Runnable {
    public Contador(String valueOf) {
    }

    public static void main(String[] args) {
        for (int i=1; i <=50; i++){
            Contador contador = new Contador(String.valueOf(i));
            Thread threadContador = new Thread(contador);
            threadContador.start();
        }
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i=1; i <=500; i++){
            System.out.println("Thread " + threadName + " contando: "  + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
