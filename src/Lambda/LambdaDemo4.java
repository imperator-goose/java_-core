package Lambda;

public class LambdaDemo4 {
    interface Inter {
        int fact(int n);
    }


    static Integer sum(Integer a, Integer b){
        a += 1;
        b += 1;
        if (a + b > 100){
            return a+b;
        }
        return sum(a,b);
    }

    public static void main(String[] args) {
        Inter factorial = (n) -> {
            int result = 1;
            for (int i = 0; i <= n; i++) {
                result = i * result;
            }
            return result;
       };
       System.out.println(factorial.fact(10));
        Integer s = sum(5,6);
        System.out.println(s);
    }
}

