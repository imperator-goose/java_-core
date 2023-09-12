package Patterns.Порождающие.Factory;

public class Program {
    public static void main(String[] args) {

        DeveloperFactory javaDeveloperFactory = new JavaDeveloperFactory();
        Developer developer = javaDeveloperFactory.createDeveloper();
        developer.writeCode();
    }
}
