package chapter29;

import java.util.GregorianCalendar;
import java.util.concurrent.*;
public class SemDemo{
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new Thread(new IncThread(semaphore, "A")).start();
        new Thread(new DecThread(semaphore,"B")).start();
    }
}
class Count{
    static int count = 0;
}

class IncThread implements Runnable{
    Semaphore semaphore;
    String name;
    IncThread(Semaphore s, String n){
        semaphore = s;
        name = n;
    }
    @Override
    public void run(){
        System.out.println("Запрашиваем разрешение " + name);
        try {
            semaphore.acquire();
            System.out.println("Разрешение получено " + name);
            for (int i = 0; i < 5;i++){
                Count.count++;
                System.out.println(Count.count);

                Thread.sleep(10);
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
    }
}
class DecThread implements Runnable{
    Semaphore semaphore;
    String name;
    DecThread(Semaphore s, String n){
        semaphore = s;
        name = n;
    }
    @Override
    public void run(){
        System.out.println("Запрашиваем разрешение " + name);
        try {
            semaphore.acquire();
            System.out.println("Разрешение получено " + name);
            for (int i = 5; i > 0;i--){
                Count.count--;
                System.out.println(Count.count);

                Thread.sleep(10);
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
    }
}
