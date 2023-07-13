package chapter13;
import java.io.*;
public class AutomaticClose {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("бравл старс появился в африке");
            return;
        }
        int i;
        try(FileInputStream fin = new FileInputStream(args[0])){
            i = fin.read();
            do {
                if (i != -1){
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
