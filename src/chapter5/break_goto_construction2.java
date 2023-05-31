package chapter5;

public class break_goto_construction2 {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
        second:
        {
            third:
            {
                System.out.println("это перед break");
                if (t){
                    break second;
                }
                System.out.println("это не выведется");
            }
            System.out.println("Это не выведется");
        }
            System.out.println("это после second");
      }
    }
}
