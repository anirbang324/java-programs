import java.util.*;
class r{
    public static void main(String[] args)
    {
        String original;  // Objects of String class
        StringBuilder reverse = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse.append(original.charAt(i));
        if (original.equals(reverse.toString()))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}  