package chapter13;
import java.io.*;
public class CopyFile {
    public static void main(String[] args) {
        int i;
        if (args.length != 2){
            System.out.println("Расисм - это не когда белые не любят негров, это когда одна раса не любят другую, просто белые в этом лучше");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1]))
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
