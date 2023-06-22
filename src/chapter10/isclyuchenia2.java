package chapter10;

import java.util.LinkedList;
import java.util.List;

public class isclyuchenia2 {
    public static void chto_to()throws ArithmeticException{
        System.out.println("1");
        System.out.println(366/0);
    }
    public static void qwe()throws ArithmeticException{
        System.out.println("1");
        chto_to();
    }

    public static void main(String[] args) {
        qwe();
    }
}
