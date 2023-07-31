package chapter24;
import java.net.*;
public class URLDemo {
        public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/WhatsNew");
                System.out.println("Пpoтoкoл: " + hp.getProtocol());
                System.out.println("nopT: " + hp.getPort());
System.out.println("XocT: " + hp .getHost());
System.out.println("^a^n: " + hp.getFile()) ;
        System.out.println("Внешняя форма:" + hp.toExternalForm());

        }
}
