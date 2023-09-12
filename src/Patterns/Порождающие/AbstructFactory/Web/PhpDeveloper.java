package Patterns.Порождающие.AbstructFactory.Web;

import Patterns.Порождающие.AbstructFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php");
    }
}
