import javax.swing.*;

public class palindrome {

  
    public static void main(String[] args) {
    
        String Str;   
     
        Str = JOptionPane.showInputDialog(null, "Enter String:");
 
        JOptionPane.showMessageDialog(null,"The word " + Str + " is palindrome: " + isPalindrome(Str) );
    }
   public static boolean isPalindrome(String word) {
    int left  = 0;                
    int right = word.length() -1;  
  
    while (left < right) {        
        if (word.charAt(left) != word.charAt(right)) {
            return false;      
        }
        left++;                   
        right--;                 
    }
    return true;                 
}
}
