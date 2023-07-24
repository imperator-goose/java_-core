package Lambda;

import java.lang.*;

public class LambdaDemo1 {
    interface Number{
        double getValue();
    }
    public static void main(String[] args) {
        Number number;
        number = () -> Math.random() * 100;
        System.out.println(number.getValue());

    }

}
