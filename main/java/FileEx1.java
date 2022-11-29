import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/chokoaiseukeulim/Desktop/workspace(intellj)/javaTest/src/main/java/FileEx1.class");
        String fileName = f.getName();
        int pos = fileName.lastIndexOf(".");

        System.out.println("경로를 제외한 파일이름 - "+f.getName());
        //System.out.println();
        System.out.println(fileName.substring(0,pos));
        System.out.println(fileName.substring(pos+1));

        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        System.out.println(f.getParent());
        System.out.println();
        System.out.println(File.pathSeparator);
        System.out.println(File.separatorChar);
        System.out.println();
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("sun.boot.class.path"));

    }

}
