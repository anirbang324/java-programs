import java.util.*;
class fibonacci
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input1= sc.nextInt();
        int a=0;
        int b=1;
        int c=2;

        while(c<=input1)
        {
            int temp=b;
            b=b+a;
            a=temp;
            c++;
        }
        System.out.println(b);
    }
}