package chapter13;


import java.io.*;



class BRRead {
    public static void main(String[] args) throws IOException {


        char c;

        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
//
//        System.out.println("Bвoдитe символы; для выхода введите q");
//
//
//        br.read();
//
//
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');
    }
}