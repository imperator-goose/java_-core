package chapter23;

import java.io . *;
import java.nio.*;
import java. nio . channels .* ;
import java.nio . file .*;
public class ExplicitChannelRead {
    public static void main(String[] args)  {
        int count;
        try (SeekableByteChannel fChan = Files.newByteChannel(Path.of("C//input.txt"));
        ) {
            ByteBuffer bf = ByteBuffer.allocate(128);
            do {
                count = fChan.read(bf);
                if (count != -1){
                    bf.rewind();

                    for (int i = 0;i< count; i++){
                        System.out.println((char)bf.get());
                    }
                }
            } while (count != -1);
            System.out.println();

        } catch (InvalidPathException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

