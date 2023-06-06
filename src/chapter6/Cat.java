package chapter6;

public class Cat {
    String name;
    int age;
    static int count;
    public Cat(String name){
        this.name = name;
    }
    public void jump(){
        System.out.println("Прыг");
    }
    public Cat(int count){
        this.name = "street_cat#"+ count;
    }
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Cat street_cat0 = new Cat(count++);
        System.out.println(barsik.name + street_cat0.name);
        barsik.jump();

    }
}
