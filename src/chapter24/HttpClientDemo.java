package chapter24;
import java.net.*;
import java.io.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        HttpClient hc = HttpClient.newHttpClient();

        HttpRequest hr = HttpRequest.newBuilder(new URI("https://www.google.ru/")).build();

        HttpResponse<InputStream> hRes = hc.send(hr, HttpResponse.BodyHandlers.ofInputStream());


    }
}
