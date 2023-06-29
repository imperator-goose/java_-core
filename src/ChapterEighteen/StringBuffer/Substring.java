package ChapterEighteen.StringBuffer;

public class Substring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I love Java");
        System.out.println(sb.substring(2));
        System.out.println(sb.substring(2,6));
        System.out.println(sb.substring(7));
    }
}
