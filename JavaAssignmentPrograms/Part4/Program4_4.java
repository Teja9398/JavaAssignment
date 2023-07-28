class Buffer{
    static int i=-1;
    static final int size=3;
}

class Producer extends Thread{
    
    public void run(){
        synchronized(this){
            Buffer.i++;
            while(Buffer.i==Buffer.size){
                    try{
                        wait();
                    }catch(InterruptedException ie){}
                }
                    System.out.println("producer produced "+(Buffer.i+1));
                    notify();
            
        }
    }
}

class Consumer extends Thread{
    public void run(){
        synchronized(this){
            Buffer.i--;
            while(Buffer.i==-1){
                    try{
                        wait();
                    }catch(InterruptedException ie){}
            }
            System.out.println("consumer consumed item "+(Buffer.i+1));
            notify();
            
        }
    }
}

public class Program4_4 {
    public static void main(String[] args) {
        Producer p=new Producer();
        Consumer c=new Consumer();
        p.start();
        c.start();
    }
}
