package array;

public class arraysort {
    public static void main(String[] args) {
        int[] integers ={23,56,23,12,66,43};
        int n= integers.length;
        System.out.println("The array is : ");
        for (int integer : integers) {
            System.out.println(" " + integer);
        }
        //start of sorting
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (integers[i]<integers[j]){
                    int t= integers[i];
                    integers[i] = integers[j];
                    integers[j] = t;
            }
            }
        }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++)
        {
            System.out.println(" "+integers[i]);
        }
        System.out.println(" ");
    }
}
