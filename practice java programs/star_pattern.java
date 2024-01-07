public class star_pattern{
    public static void main(String[] args) {
        int r = 5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        int rev = 5;
        for(int i=1;i<=rev;i++){
            for(int j=rev;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}