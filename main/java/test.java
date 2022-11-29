import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Optional;

public class test {
    public static void main(String[] args) throws IOException {
        //자바에서는 입력과 출력이 각각 분리되어 별도로 작업을 하도록 설계되어 있는데, RandomAccess
        RandomAccessFile raf = new RandomAccessFile("/Users/chokoaiseukeulim/Desktop/workspace(intellj)/javaTest/src/main/java/test.txt","rw");
        System.out.println("파일포인터의 위치:"+raf.getFilePointer());

        raf.writeInt(10);
        System.out.println("파일 포인터의 위치:"+raf.getFilePointer());

        raf.writeLong(100L);
        System.out.println("파일포인터의 위치: "+raf.getFilePointer());
    }
}
