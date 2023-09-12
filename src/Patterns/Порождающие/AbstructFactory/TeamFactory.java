package Patterns.Порождающие.AbstructFactory;

public interface TeamFactory {
    public Developer getDeveloper();
    public ProjectManager getPM();
    public ManualTester gerMT();
}
