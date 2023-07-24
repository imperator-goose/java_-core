package Lambda;

public class LambdaDemo8 {
    interface Inter{
        int inter(int n);
    }

    public static void main(String[] args) {
        int num = 10;
        Inter chto_to = (n) ->{
            int v = n + num;
            return v;
        };
    }
}
