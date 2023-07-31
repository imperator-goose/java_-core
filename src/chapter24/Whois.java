package chapter24;
import java.net.*;
import java.io.*;
public class Whois {
    public static void main(String [] args) throws Exception {
        int с;
// Создать сокет, подключенный к in te rn ic .n e t, порт 43.
        // Управлять этим сокетом с помощью блока try с ресурсами.
        try (Socket s = new Socket("whois.internic.net", 43)) {
// Получить потоки ввода и вывода.
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
// Сконструировать строку запроса.
            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
// Преобразовать в байты.
            byte[] buf = str.getBytes();
// Отправить запрос.
            out.write(buf);
// Прочитать и отобразить ответ.
            while ((с = in.read()) != -1) {
                System.out.print((char) с);
            }
        }
// Сокет теперь закрыт.
    }

    }
