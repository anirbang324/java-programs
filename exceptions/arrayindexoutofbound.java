package exceptions;

public class arrayindexoutofbound {
    // Java program to demonstrate ArrayIndexOutOfBoundException
        public static void main(String args[])
        {
            try{
                int a[] = new int[5];
                a[6] = 45; // accessing 7th element in an array of
                // size 5
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println ("Array Index is Out Of Bounds");
            }
        }
    }

