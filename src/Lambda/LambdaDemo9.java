package Lambda;

public class LambdaDemo9 {

    interface StringFunc{
        String value(String s);
    }
    class MyString{
        static String strReverse(String s){
            String result = "";
            for (int i = s.length()-1;i>=0;i--){
                result += s.charAt(i);
            }
            return result;
        }
    }


}
class MyString1{
    static String strOpp(LambdaDemo9.StringFunc sf, String s){
        return sf.value(s);
    }

    public static void main(String[] args) {
        String inStr = "Расисм - это не когда белые не любят негров, это когда некоторые люди не любят другую расу, просто белые в этом лучше";
        String outStr;
        outStr = strOpp(LambdaDemo9.MyString::strReverse, inStr);
        System.out.println(outStr);
        System.out.println(1);
    }
}
