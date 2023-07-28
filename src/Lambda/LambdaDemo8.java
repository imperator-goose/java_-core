package Lambda;
interface Inter{
    int inter(int n);
}
public class LambdaDemo8 {


    public static void main(String[] args) {
        int num = 10;
        Inter chtoTo = (n) ->{
            int v = n + num;
            return v;
        };
    }
}
