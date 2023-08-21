package chapter11;
import java.lang.Thread;
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Thread Demo");
        System.out.println("Дочерний поток: " + t);
    }


    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток закончен");
    }

    static class ThreadDemo {
        public static void main(String[] args) {


            NewThread nt = new NewThread();
            nt.t.start();
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("Главный поток" + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Главный поток прерван");
            }
            System.out.println("Главный поток закончен");
        }
    }
}
    

