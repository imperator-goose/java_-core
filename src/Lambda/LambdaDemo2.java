package Lambda;
import java.util.Scanner;


interface Booleen{
    boolean getValue(int n);
}
public class LambdaDemo2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Booleen value;
        value = (n) -> n % 2 == 0;
        if (value.getValue(in.nextInt())){
            System.out.println("Это чётное число");
        } else {
            System.out.println("Это нечётное число");
        }

        Booleen isNonNeg;
        isNonNeg = (n) -> n >= 0;
        if (isNonNeg.getValue(in.nextInt())) {
            System.out.println("Это неотрицательное число");
        } else {
            System.out.println("Это отрицательное число");
        }

    }
}
