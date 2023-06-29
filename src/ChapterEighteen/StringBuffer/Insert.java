package ChapterEighteen.StringBuffer;

public class Insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Привет");
        sb.insert(6,", Руслан");
        System.out.println(sb);
    }
}
