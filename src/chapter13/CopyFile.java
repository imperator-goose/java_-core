package chapter13;
import java.io.*;
public class CopyFile {
    public static void main(String[] args) {
        int i;


        try(FileInputStream fin = new FileInputStream("C://input.txt");
        FileOutputStream fout = new FileOutputStream("C://output.txt"))
        {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
