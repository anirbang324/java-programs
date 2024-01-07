package stack;
import java.io.*;
public class invest {
    public static void main(String[] args) {
        Float principalamount = new Float(0);
        Float interestrate = new Float(0);
        int numYears = 0;
        try
        {
            DataInputStream in = new DataInputStream(System.in);
            System.out.println("Enter principal amuont: ");
            System.out.flush();
            String principalString = in.readLine();
            principalamount = Float.valueOf(principalString);
            System.out.println("Enter interest rate: ");
            System.out.flush();
            String interestString = in.readLine();
            interestrate = Float.valueOf(interestString);
            System.out.println("enter the number of years: ");
            System.out.flush();
            String yearsString = in.readLine();
            numYears = Integer.parseInt(yearsString);
        }
        catch (IOException e)
        {
            System.out.println("I/O error");
            System.exit(1);
        }
        float value = loan(principalamount.floatValue(),interestrate.floatValue(),numYears);
        printline();
    }
    static float loan(float p, float r ,int n)
    {
        int year = 1;
        float sum = p;
        while(year <= n){
            sum = sum*(1+r);
            year = year+1;
        }
        return sum;
    }
    static void printline(){
        for(int i=1;i<=30;i++){
            System.out.println("=");
        }
        System.out.println(" ");
    }
}
