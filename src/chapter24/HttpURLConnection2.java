package chapter24;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HttpURLConnection2 {
    public static void get(List d){
        System.out.println("fgdfg");
    }
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.google.com");
        HttpURLConnection htUrl = (HttpURLConnection) url.openConnection();

        System.out.println("Метод запроса "+htUrl.getRequestMethod());

        System.out.println("Код ответа "+htUrl.getResponseCode());

        System.out.println("Сооющение ответа "+ htUrl.getResponseMessage());

        List<Integer> s = new LinkedList<>();
        get(s);
        s.add(54);
        s.add(45);
        s.stream().forEach(a -> System.out.println(a));


    }
}
