package ChapterEighteen;

public class CompareTo {
    public static void main(String[] args) {
        int a;
        String s = "Hello";
        String c = "Hello";
        a = s.compareTo(c);
        if (a == 0){
            System.out.println("Строка s и строка c равны");
        } else{
            System.out.println("Это никогда не отобразится:(");
        }

    }
}
