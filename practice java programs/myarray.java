import java.util.*;
public class myarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[5];
        int size= arr.length;
        System.out.println("Enter the value of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The values of the array are:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

    }
}