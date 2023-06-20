package chapter10;

public class isclyuchenia {
    public static void main(String[] args) {
        try {
            System.out.println(366/0);
        } catch (ArithmeticException e){
            System.out.println("На ноль нельзя делить!");
        } finally {
            System.out.println("Программа завершилась");
        }
    }
}
