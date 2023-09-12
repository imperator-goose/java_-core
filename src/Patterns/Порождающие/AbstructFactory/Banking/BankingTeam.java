package Patterns.Порождающие.AbstructFactory.Banking;

import Patterns.Порождающие.AbstructFactory.ProjectManager;
import Patterns.Порождающие.AbstructFactory.TeamFactory;
import Patterns.Порождающие.AbstructFactory.Developer;
import Patterns.Порождающие.AbstructFactory.ManualTester;


public class BankingTeam implements TeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getPM() {
        return new BankingManager();
    }

    @Override
    public ManualTester gerMT() {
        return new QATester();
    }
}
