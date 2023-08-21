package chapter11;
import java.lang.Runnable;
public class NewThread2 implements Runnable{
    String name; // и м я потока
    Thread t;
    NewThread2 (String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
    }
    // Это точка входа для потока.
    public void run() {
        try {
            for(int i = 5; i > 0; i-- ) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException е){
            System.out.println(name + " прерван");
    }
        System.out.println(name + " завершен.");
}
}
class MultiThreadDemo{
    public static void main(String[] args) {


        NewThread2 nt1 = new NewThread2("One");
        NewThread2 nt2 = new NewThread2("Two");
        NewThread2 nt3 = new NewThread2("Three");
                nt1 .t.start();
        nt2.t.start();
        nt3.t.start();
        try {
                    Thread.sleep(10000);
        } catch (InterruptedException е){
            System.out.println(" Глaвный по т о к прерван");
        }
        System.out.println("Зaвepшeниe г л авного потока.");
    }
        }
