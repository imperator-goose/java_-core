package chapter_9;


import java.util.Scanner;

public class Duck implements Swimmable{
    @Override
    public void swim() {

        System.out.println("Утка плыви");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Duck duck = new Duck();
        duck.swim();
    }
}
