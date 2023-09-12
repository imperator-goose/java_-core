package Patterns.Порождающие.Prototype;

public class Project implements Copyable {
    String name;
    String sourseCode;
    int id;

    public Project(String name, String sourseCode, int id) {
        this.name = name;
        this.sourseCode = sourseCode;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourseCode() {
        return sourseCode;
    }

    public void setSourseCode(String sourseCode) {
        this.sourseCode = sourseCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object copy() {
        Project copy = new Project(name, sourseCode,id);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", sourseCode='" + sourseCode + '\'' +
                ", id=" + id +
                '}';
    }
}
