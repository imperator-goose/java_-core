package chapter13;


import java.io.*;


public class BRReadLine {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
    }
}
