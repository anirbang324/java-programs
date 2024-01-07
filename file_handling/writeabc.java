package file_handling;
import java.io.*;
import java.io.IOException;
public class writeabc {
    public static void main(String[] args) throws IOException {
        FileWriter f1 = new FileWriter("E:\\java programs\\dummyfiles\\abc.java");
        f1.write("public class abc{\n" +
                "public static void main(String var[]){\n" +
                "System.out.println(\"1\");\n" +
                "System.out.println(\"12\");\n" +
                "System.out.println(\"123\");\n" +
                "System.out.println(\"1234\");\n" +
                "System.out.println(\"12345\");\n" +
                "System.out.println(\"123456\");\n" +
                "System.out.println(\"1234567\");\n" +
                "System.out.println(\"12345678\");\n" +
                "System.out.println(\"123456789\");\n" +
                "System.out.println(\"12345678910\");\n" +
                "}}");
        f1.close();
        System.out.println("content is written");
    }
}


