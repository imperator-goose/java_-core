package ChapterEighteen.StringBuffer;

public class GetChar {
    public static void main(String[] args) {
        String s = "Привет, Руслан";
        char[] target = new char[6];
        s.getChars(8,14, target ,0);
        System.out.println(target);
    }
}
