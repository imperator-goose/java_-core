package ChapterTwenty;
import java.util.*;
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spane");
        states.add("Great Britain");
        System.out.println(states.first());
        System.out.println(states.last());
    }
}
