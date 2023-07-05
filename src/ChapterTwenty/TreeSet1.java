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
        SortedSet<String> set = states.subSet("Germany","Italy");
        System.out.println(set);
        NavigableSet<String> set1 = states.descendingSet();
        System.out.println(set1);
        SortedSet<String> setLower = states.tailSet("Germany");
        System.out.println(setLower);
        SortedSet<String> serGreater = states.headSet("Germany");
    }
}
