package chapter13;
import java.io.*;
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter(System.out, true);

        int i = 1;
        pw.println(i);
    }
}
