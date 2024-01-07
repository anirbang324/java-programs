package exceptions;

public class error1 {
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=5;
        int x = a/(b-c);
        System.out.println("x="+x);
        int y= a/(a+b);
        System.out.println("y="+y);
    }
}
