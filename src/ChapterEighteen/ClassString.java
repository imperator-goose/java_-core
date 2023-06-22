package ChapterEighteen;

public class ClassString {
    public static void main(String[] args) {
    char[] chars = {'a'};
    String s = new String (chars);
    System.out.println(s);
    char[] chars1 = {'c', 'b', 'c', 'd', 'e', 'f'};
    String a = new String(chars1, 3,2);
    System.out.println(a);
    byte[] Byte = {65,66,67,68,69,70};
    String c = new String(Byte);
    System.out.println(c);
    }
}
