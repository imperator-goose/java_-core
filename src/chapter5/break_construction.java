package chapter5;

public class break_construction {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Итерация " + i + ": ");
            for (int j = 0; j < 10; j++) {
                if (j == 4) {
                    break; // закончить цикл, если j = 4
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Цикл завершен.");
    }
}

