package ChapterEighteen.StringBuffer;

public class Replace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Строка для тестирования");
        sb.replace(7,10,"для целей");
        System.out.println(sb);
    }
}
