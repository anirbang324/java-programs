public class countpairs{
    public static int findnum(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (i<j && arr[i]==arr[j] && (i*j)%x==0){
                    count++;
                }
            }
        }
        return count;

        }

    public static void main(String[] args) {
        {
            int a[]={2,2,2};
            System.out.println(findnum(a,3));
        }
    }
    }
