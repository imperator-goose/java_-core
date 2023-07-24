package Lambda;

public class LambdaDemo6 {
    interface StringFunc{
        String value(String n);
    }
static String stringOp(StringFunc sf, String s){
        return sf.value(s);
}
    public static void main(String[] args) {

        String inStr = "Расисм - это не когда белые не любят негров, это когда некоторые люди не любят другую расу, просто белые в этом лучше";
        String outStr;
        System.out.println(inStr);
        outStr=stringOp((str) -> str.toUpperCase(),inStr);
        System.out.println(outStr);


        outStr = stringOp((str) -> {
            String result = "";
            for (int i = 0;i<str.length();i++){
                if (str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;
        },inStr);

        System.out.println(outStr);
    }
}
