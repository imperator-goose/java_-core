package Patterns.Порождающие.Builder;

public class Website {
    String name;
    Cmc cmc;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCmc(Cmc cmc) {
        this.cmc = cmc;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cmc=" + cmc +
                ", price=" + price +
                '}';
    }
}
