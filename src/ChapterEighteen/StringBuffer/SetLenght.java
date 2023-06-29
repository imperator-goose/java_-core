package ChapterEighteen.StringBuffer;

public class SetLenght {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.charAt(4));
        sb.setCharAt(1,'i');
        sb.setLength(2);
        System.out.println(sb);
        System.out.println(sb.charAt(1));
    }
}
