package Patterns.Project1.Factory;

import Patterns.Project1.CppDeveloper;
import Patterns.Project1.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createNewDeveloper(){
        return new CppDeveloper();
    }
}
