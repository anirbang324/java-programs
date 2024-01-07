
import java.util.*;
public class missing{
    public static int findnum(int[] arr){
        int n=arr.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++){
            sum-=arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a= new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("my array is"+ Arrays.toString(a));
        System.out.println("missing number is"+findnum(a));
    }
}