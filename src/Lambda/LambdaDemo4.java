package Lambda;

public class LambdaDemo4 {
    interface myNumber{
        int getValue(int n);
    }
    public static void main(String[] args) {
        myNumber factorial = (n) -> {
            int result = 1;
            for (int i = 1; i<= n;i++){
                result = result * i;
            }
            return result;
        };
        System.out.println(factorial.getValue(3));
        System.out.println(factorial.getValue(5));
    }
}


