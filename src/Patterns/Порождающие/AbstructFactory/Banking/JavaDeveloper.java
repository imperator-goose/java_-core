package Patterns.Порождающие.AbstructFactory.Banking;

import Patterns.Порождающие.AbstructFactory.Developer;


public class JavaDeveloper implements Developer {
    @Override
    public void writeCode(){
        System.out.println("java");
    }
}
