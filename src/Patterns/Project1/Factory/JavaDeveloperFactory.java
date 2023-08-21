package Patterns.Project1.Factory;

import Patterns.Project1.Developer;
import Patterns.Project1.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createNewDeveloper(){
        return new JavaDeveloper();
    }
}
