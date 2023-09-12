package Patterns.Порождающие.Prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    Project copyProject(){
        return (Project) project.copy();
    }
}
