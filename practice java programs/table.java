import java.util.Scanner;

public class table{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int val;
        for(int i=1;i<=10;i++) {

            val=i*num;
            System.out.println(val);

        }
    }
}
