public class workingday{
    enum days{
        Sunday,
        Monday,
        Wednesday,
        Thursaday,
        Friday,
        Saturday
    }
    public static void main(String args[]){
        for(days d: days.values())
        {
            weekend(d);
        }  }

    private static void weekend(days d){
        if(d.equals(days.Sunday))
            System.out.println("value= "+d+" is holiday");
        else
            System.out.println("value= "+d+" is a working day");
    }
}