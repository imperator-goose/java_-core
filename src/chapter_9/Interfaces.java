package chapter_9;

public class Interfaces {
    public interface Swimmable{
        public void swim();
    }
    public static class Duck implements Swimmable {

        public void swim() {
            System.out.println("Уточка, плыви!");
        }

        public static void main(String[] args) {

            Duck duck = new Duck();
            duck.swim();
        }
    }

}
