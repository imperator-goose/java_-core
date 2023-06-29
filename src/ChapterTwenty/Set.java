package ChapterTwenty;
import java.util.HashSet;
public class Set {
    public static void main(String[] args) {
        HashSet<String> stats = new HashSet<String>();
        stats.add("Germany");
        stats.add("France");
        stats.add("Italy");
        boolean Isadd = stats.add("Germany");
        System.out.println(Isadd);
        System.out.println("Размеры массива"+ stats.size());
        for (String stats1 : stats){
            System.out.println(stats1);
        }
        stats.remove("Germany");
        class Person{

            private String name;
            public Person(String value){

                name=value;
            }
            String getName(){return name;}
        }
        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Robert"));
        for (Person people1 :people){
            System.out.println(people1.getName());
        }

    }
}
