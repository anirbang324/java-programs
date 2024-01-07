import java.util.*;
class invalidageexception extends Exception{
    public invalidageexception(String str)
    {
        super(str);
    }
}
public class userdefinedexcep {
    static void validate(int age) throws invalidageexception{
        if(age<18) {
            throw new invalidageexception("age is not valid");
        }
        else
        {
            System.out.println("You are eligible for voting");
        }
    }

    public static void main(String[] args) throws invalidageexception {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("please enter your age to verify:");
        a= sc.nextInt();
        sc.close();
        try{
            validate(a);
        }
        catch(invalidageexception e) {
            System.out.println("Caught the exception");
            System.out.println("exception occured: " + e);
        }
    }
}
