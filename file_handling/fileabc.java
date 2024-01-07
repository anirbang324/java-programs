package file_handling;
import java.io.*;
import java.io.IOException;
public class fileabc {
    public static void main(String[] args) throws IOException {
        File f0 = new File("E:\\java programs\\dummyfiles\\abc.java");
        if (f0.createNewFile()) {
            System.out.println("File successfully created : ");
        } else {
            System.out.println("file is not created");
        }
    }
}

