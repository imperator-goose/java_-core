package chapter5;

public class break_goto_cinstructionV2 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Итерация " + i + ": ");
            for (int j = 0; j < 100; j++) {

                if (j == 10) {
                    break outer; // выйти из обоих циклов
                }
                System.out.print(j + " ");
            }
            System.out.println("Эта строка никогда не будет выведена");
        }
        System.out.println("Цикл завершен.");
    }
}

