package ChapterTwenty;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();
        states.add("Germany");
        states.add("Great Britany");
        states.add("France");
        states.add("Spane");
        states.add(1,"Italy");
        System.out.println(states);
        states.set(1, "Portugal");
        System.out.println(states);
        if(states.contains("Germany")){

            System.out.println("List contains Germany");
        }
        states.remove("Germany");
        states.removeFirst();
        states.removeLast();
        System.out.println(states);
    }
}
