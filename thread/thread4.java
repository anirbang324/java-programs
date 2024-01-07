package thread;

import java.lang.Thread;
import java.math.*;
import java.util.prefs.PreferenceChangeEvent;

class Ani extends Thread {
    public void run(){
        for(int i=0;i<=5;i++)
        {
            if(i == 4){
//             yield(PreferenceChangeEvent.run(i));
            }
            System.out.println("\t from thread A : i= " +i);
        }
        System.out.println("Exit from thread A");
    }
}
class B extends Thread{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("\t from thread B : j= "+j);
        }
        System.out.println("Exit from thread B");
    }
}
class C extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("\t from thread C : k= "+k);
        }
        System.out.println("Exit from thread C");
    }
}
class thread4{
    public static void main(String[] args) {
        new Ani().start();
        new B().start();
        new C().start();
    }
}