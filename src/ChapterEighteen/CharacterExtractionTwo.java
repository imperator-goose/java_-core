package ChapterEighteen;

public class CharacterExtractionTwo {
    public static void main(String[] args) {
        String s = "Привет, Руслан!";
        char[] buf = new char[6];
        s.getChars(8, 14, buf, 0);
        System.out.println(buf);
    }
}
