package exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class filenotfound {
    //Java program to demonstrate FileNotFoundException
        public static void main(String[] args) {
            try {

                // Following file does not exist
                File file = new File("D://anirban.txt");

                FileReader fr = new FileReader(file);
            } catch (FileNotFoundException e) {
                System.out.println("File does not exist");
            }
        }
    }
