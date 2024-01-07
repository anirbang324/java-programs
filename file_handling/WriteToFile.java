package file_handling;
import java.io.FileWriter;
// Importing the IOException class for handling errors
import java.io.IOException;
class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fwrite = new FileWriter("E:\\java programs\\file_handling\\Anirban.txt");
            // writing the content into the FileOperationExample.txt file
            fwrite.write("Hello, this is first line of my file");

            // Closing the stream
            fwrite.close();
            System.out.println("Content is successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }
}