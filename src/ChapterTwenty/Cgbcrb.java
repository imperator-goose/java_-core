package ChapterTwenty;
import java.util.ArrayList;
public class Cgbcrb {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        people.add("Tom");
        people.add("Kate");
        people.add(1,"Jack");
        System.out.println(people.get(1));
        people.set(1,"Robert");
        System.out.printf("Размер массива"+ people.size());
        System.out.println();
        if (people.contains("Tom")){
            System.out.println("Tom существует");
        }
        for (String person : people){
            System.out.println(person);
        }
        people.remove("Robert");
        people.remove(0);
        for (String person1 : people){
            System.out.println(person1);
        }
    }
}
