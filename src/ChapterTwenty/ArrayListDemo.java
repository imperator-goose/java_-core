package ChapterTwenty;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("A1");
        a1.add("A3");
        a1.add("A4");
        a1.add("A5");
        a1.add("A6");
        a1.add("A7");
        a1.add(1,"A2");
        System.out.println("Размер массива: "+ a1.size());

        a1.remove(0);
        a1.remove(2);
        System.out.println(a1);
    }
}
