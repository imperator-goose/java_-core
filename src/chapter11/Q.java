package chapter11;

public class Q {
    int n;
    boolean valueSet = false;
    public void get(){
        try {
            wait();
        } catch (InterruptedException e){
            System.out.println("ff");
        }
        System.out.println("Получено: " + n);
    }
}
