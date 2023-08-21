package Patterns.Project1;

import Patterns.Project1.Factory.CppDeveloperFactory;
import Patterns.Project1.Factory.DeveloperFactory;
import Patterns.Project1.Factory.JavaDeveloperFactory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory javaDeveloperFactory = new JavaDeveloperFactory();
        Developer javaDeveloper = javaDeveloperFactory.createNewDeveloper();

        DeveloperFactory cppDeveloperFactory = new CppDeveloperFactory();
        Developer cppDeveloper = cppDeveloperFactory.createNewDeveloper();

        javaDeveloper.writeCode();

        cppDeveloper.writeCode();

    }
}
