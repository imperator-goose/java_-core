package ChapterTwenty;
import java.sql.SQLOutput;
import java.util.ArrayDeque;
public class Queue {
    public static void main(String[] args) {
        ArrayDeque<String> states =new ArrayDeque<>();
        states.add("Germany");
        states.addFirst("France");
        states.push("Great Britain");
        states.add("Italy");
        states.addLast("Spane");
        System.out.println(states);
        System.out.println();

        String sFirst = states.getFirst();
        System.out.println(sFirst);
        System.out.println();

        String sLast = states.getLast();
        System.out.println(sLast);
        System.out.println();

        System.out.println("Размер массива states: "+ states.size());
        System.out.println();

        System.out.println();
        ArrayDeque<String> Person = new ArrayDeque<String>();
        Person.addFirst("Tom");
        Person.add("Kate");
        Person.addLast("Nick");
        for (String printPerson: Person){
            System.out.println(printPerson);
        }
        System.out.println();
        System.out.println(states);
    }
}
