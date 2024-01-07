import java.util.Scanner;

public class facto1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int val=1;
        for(int i=1;i<=num;i++)
        {
            val=val*i;
        }
        System.out.println(val);
    }
}