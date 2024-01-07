package thread;

public class thread2 extends Thread{
        public void run(){
            for(int i=1;i<5;i++){
                // the thread will sleep for the 500 milli seconds
                try{Thread.sleep(500);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                System.out.println(i);
            }
        }
        public static void main(String[] args){
            thread2 t1=new thread2();
            thread2 t2=new thread2();
            t1.start();
            t2.start();
        }
    }

