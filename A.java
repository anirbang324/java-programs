import java.util.Scanner;
public class A{
public static void main(String[] args)
{
int a,b;
Scanner object1=new Scanner(System.in);
System.out.println("enter the value:");
a=object1.nextInt();
System.out.println("enter the value:");
b=object1.nextInt();
object1.close();
System.out.println("The value of a is" +a);
System.out.println("The value of b is" +b);
System.out.println(a+b);
}
}