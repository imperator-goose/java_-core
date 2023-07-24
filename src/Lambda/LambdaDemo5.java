package Lambda;

public class LambdaDemo5 {
    interface SomeFunc<T>{
        T value(T n);
    }

    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1;i>=0;i--){
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(reverse.value("sNigers"));
        SomeFunc<Integer> factorial = (t) -> {
            int result = 1;
            for (int i = 1;i<=t;i++){
                result = result * i;
            }
            return result;
        };
        System.out.println(factorial.value(3));
    }
}
