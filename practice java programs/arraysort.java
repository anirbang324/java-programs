import java.util.*;
public class arraysort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int size= arr.length;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int j : arr) {
            System.out.println(j);
        }
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println("sorted array is: ");
            for(int k=0;k<size;k++)
            {
                System.out.println(arr[k]);
            }
            System.out.println(" ");
        }
    }
}