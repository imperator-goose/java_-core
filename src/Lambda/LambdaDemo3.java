package Lambda;

public class LambdaDemo3 {
    interface Boolean{
        boolean test(int n, int d);
    }

    public static void main(String[] args) {
        Boolean value = (n, d) -> n % d ==0;
        if(value.test(10, 2))
            System.out.println ( "2 явл я е т с я м н о ж и т е л е м 1 0 " );
        if(value.test(10, 3))
            System.out.println ( " 3 не явл я е т с я м н о ж и т е л е м 10");
    }
}
