package chapter13;
import java.io.*;
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        String[] str = new String[100];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));


            for (int i = 0; i<=100;i++){
                str[i] = br.readLine();
                if (!str.equals("stop")) break;
            }


        for (int i = 0;i<=100;i++){
            System.out.println(str[i]);
        }
    }
}
