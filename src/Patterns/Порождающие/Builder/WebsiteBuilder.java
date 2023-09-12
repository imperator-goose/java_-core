package Patterns.Порождающие.Builder;

public abstract class WebsiteBuilder {
    Website website;

    public void createWebsite(){
        website = new Website();
    }

    abstract void buildCmc();
    abstract void buildName();
    abstract void buildPrice();

    Website getWebsite(){
        return website;
    }
}
