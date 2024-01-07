package exceptions;

public class numberformatexception {
    // Java program to demonstrate NumberFormatException
        public static void main(String args[])
        {
            try {
                // "anirban" is not a number
                int num = Integer.parseInt ("anirban") ;
                System.out.println(num);
            } catch(NumberFormatException e) {
                System.out.println("Number format exception");
            }
        }
    }
