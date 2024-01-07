class myexception extends Exception
{

}
public class userddefinedexception2 {
    public static void main(String[] args) {
        try
        {
            throw new myexception();
        }
        catch (myexception e){
            System.out.println("caught the exception: ");
            System.out.println(e.getMessage());
        }
    }
}



