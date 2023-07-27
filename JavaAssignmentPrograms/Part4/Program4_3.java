class Thread1 extends Thread{
        public void run(){
            while(true){
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
        }
    }
    class Thread2 extends Thread{
        public void run(){
            while(true){
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
        }
    }
    class Thread3 extends Thread{
        public void run(){
            while(true){
                System.out.println("Welcome");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
        }
    }

public class Program4_3 {
    
    public static void main(String[] args){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        t1.start();
        t2.start();
        t3.start();

    }
}
