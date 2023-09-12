package Patterns.Порождающие.Prototype;

public class Runner {
    public static void main(String[] args) {
        Project project1 = new Project("name,so ","s",1);

        System.out.println(project1);

        ProjectFactory factory = new ProjectFactory(project1);
        Project masterClone = factory.copyProject();

        System.out.println(masterClone);
    }
}
