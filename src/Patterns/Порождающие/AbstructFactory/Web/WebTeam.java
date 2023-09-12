package Patterns.Порождающие.AbstructFactory.Web;

import Patterns.Порождающие.AbstructFactory.Developer;
import Patterns.Порождающие.AbstructFactory.ManualTester;
import Patterns.Порождающие.AbstructFactory.ProjectManager;
import Patterns.Порождающие.AbstructFactory.TeamFactory;

public class WebTeam implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProjectManager getPM() {
        return new WebManager();
    }

    @Override
    public ManualTester gerMT() {
        return new WebTester();
    }
}
