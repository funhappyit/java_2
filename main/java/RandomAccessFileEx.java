import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        int sum =0;
        try{
            RandomAccessFile raf = new RandomAccessFile("/Users/chokoaiseukeulim/Desktop/workspace(intellj)/javaTest/src/main/java/test2.txt","r");
            int i = 4;
            while (true){
                raf.seek(i);
                sum += raf.readInt();
                i+=16;
            }
        } catch (EOFException e) {
            System.out.println("sum:"+sum);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
