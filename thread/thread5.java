package thread;
import java.lang.Thread;

class ab1 extends Thread {
    public void run()
    {
        for(int i = 1; i<=5; i++)
        {

            System.out.println("\t from thread A : i=" +i);
        }
        System.out.println("Exit from A");
    }
}
class ab2 extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\t from thread B : j=" + j);
            if (j == 3) stop();
        }
        System.out.println("Exit from B");
    }
}
class ab3 extends Thread{
    public void run()
    {
        for(int k=1;k<=5;k++) {
            System.out.println("\t from thread c : k=" + k);
            if (k == 1)
                try {
                    sleep(1000);
                } catch (Exception ignored) {
                }
        }
        System.out.println("Exit from C");
    }
}
public class thread5
        {
public static void main(String[]args) {
    ab1 threadA = new ab1();
    ab2 threadB = new ab2();
    ab3 threadC = new ab3();
    System.out.println("Start thread A");
    threadA.start();
    System.out.println("Start thread B");
    threadB.start();
    System.out.println("Start thread C");
    threadC.start();
    System.out.println("End of main thread");
}}

