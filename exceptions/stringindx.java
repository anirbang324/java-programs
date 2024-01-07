package exceptions;

public class stringindx {
    // Java program to demonstrate StringIndexOutOfBoundsException

        public static void main(String[] args)
        {
            try {
                String a = "This is like chipping "; // length is 22
                char c = a.charAt(24); // accessing 25th element
                System.out.println(c);
            }
            catch(StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException");
            }
        }
    }

