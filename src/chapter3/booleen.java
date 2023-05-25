package chapter3;

public class booleen {
    public static void main(String[] args) {
        boolean x ;
         x = false;
        System.out.println("Ь равно " + x);
         x = true;
        System.out.println("b равно " + x);
// Значение boolean может управлять оператором if.
        if (x) System.out.println("Это выполняется.");

        if (x) System.out.println("Это не выполняется.");
// Результатом операции отношения является значение boolean.
        System.out.println("lO > 9 равно " + (10 > 9));
    }
}


