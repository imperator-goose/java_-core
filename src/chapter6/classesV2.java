package chapter6;
class cat {
    String name;
    int age;
    static int count;

    public static void main(String[] args) {
        cat barsik = new cat();
        barsik.name = "barsik";
        barsik.age = 1;
        count++;
        cat bublic = new cat();
        bublic.name = "bublic";
        bublic.age = 2;
        count++;
        System.out.println("Имена котов: "+ bublic.name + " и "+ barsik.name);
        System.out.println("J,ott rjkbxtcndj rjnjd: "+ count);
    }
}
