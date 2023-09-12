package Patterns.Порождающие.Factory;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper(){
        return new JavaDeveloper();
    }
}
