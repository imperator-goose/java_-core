package chapter22;
import java.io.FilenameFilter;
import java.io.*;
public class FilenameFilterDemo {

        public static void main(String[ ] args) {
            String dirname = "C://Имение Руслана. Никому не трогать3";
            File fl = new File (dirname) ;
            FilenameFilter only = new OnlyExt("html");
            String [] s = fl.list( only ) ;
            for (int i=0; i < s.length ; i++) {
                System.out.println(s [i] ) ;
            }
        }

    public static class OnlyExt implements FilenameFilter {
        String ext;

        public OnlyExt(String ext) {
            this.ext = "." + ext;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }
}
