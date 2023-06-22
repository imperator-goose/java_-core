package ChapterEighteen;

public class Regionmatches {
    public static void main(String[] args) {
        String str1 = "Привет, Руслан!";
        String str2 = "Руслан";
        String str3 = "РУСЛАН";

        System.out.print("Возвращаемое значение: ");
        System.out.println(str1.regionMatches(8, str2, 0, 6));

        System.out.print("Возвращаемое значение: ");
        System.out.println(str1.regionMatches(8, str3, 0, 6));

        System.out.print("Возвращаемое значение: ");
        System.out.println(str1.regionMatches(true,8, str3, 0, 6));

    }
}
