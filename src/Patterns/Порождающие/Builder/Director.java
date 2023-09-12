package Patterns.Порождающие.Builder;

public class Director {
    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    Website buildWebsite(){
        websiteBuilder.createWebsite();
        websiteBuilder.buildCmc();
        websiteBuilder.buildName();
        websiteBuilder.buildPrice();

        Website website = websiteBuilder.getWebsite();
        return website;
    }
}
