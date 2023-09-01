package Patterns.Project1.Factory;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper(){
        return new JavaDeveloper();
    }
}
