package chapter13;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;
public class ReadFile {



        public static void main(String[] args) {
            // Чтение файла и запись его содержимого в другой файл
            try {
                FileInputStream fileInputStream = new FileInputStream("C://input.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("C://output.txt");

                int data;
                while ((data = fileInputStream.read()) != -1) {
                    fileOutputStream.write(data);
                }
                fileInputStream.close();
                fileOutputStream.close();

                System.out.println("Файл успешно прочитан и записан.");
            } catch (IOException exception){
                exception.printStackTrace();
            }


        }

}
