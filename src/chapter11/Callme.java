package chapter11;

public class Callme {
    synchronized void call(String msg){
        try {
            System.out.print("[" + msg);
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Прерван");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    String s;
    Thread t;
    Callme target;
    public Caller(Callme targ, String msg){
        target = targ;
        s = msg;
        t = new Thread(this);
    }
    public void run(){
        target.call(s);
    }
}
class Synch{
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller c1 = new Caller(target, "Hello");
        Caller c2 = new Caller(target, "ddd");
        Caller c3 = new Caller(target, "ddd");

        c1.t.start();
        c2.t.start();
        c3.t.start();

        try {
            c1.t.join();
            c1.t.join();
            c1.t.join();
        } catch (InterruptedException e){
            System.out.println("Прерван");
        }

    }
}
