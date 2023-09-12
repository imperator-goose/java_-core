package Patterns.Порождающие.AbstructFactory.Web;

import Patterns.Порождающие.AbstructFactory.ProjectManager;

public class WebManager implements ProjectManager {
    @Override
    public void writeCode() {
        System.out.println("web manager");
    }
}
