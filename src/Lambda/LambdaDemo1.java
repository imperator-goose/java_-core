package Lambda;

import java.lang.*;
interface Number{
    double getValue();
}
public class LambdaDemo1 {

    public static void main(String[] args) {
        Number number;
        number = () -> Math.random() * 100;
        System.out.println(number.getValue());

    }

}
