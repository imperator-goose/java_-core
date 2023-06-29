package ChapterEighteen.StringBuffer;

public class delete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Снигерс");
        sb.delete(0,1);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
