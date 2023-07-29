import java.util.Scanner;

class Buffer{
    static int size;
    static int i=0;

    Buffer(int size){
        this.size=size;
    }
    
    public synchronized void produce(){
        if(i==size){
            System.out.println("Buffer if full");
            try{
                wait();
            }catch(InterruptedException i){}
        }
        i++;
        System.out.println("produced: "+i);
        notify();
    }
    public synchronized void consume(){
        if(i==0){
            System.out.println("Buffer is empty.");
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        i--;
        System.out.println("consumed: "+i);
        notify();

    }
}

class Producer extends Thread{
    Buffer b;
    Producer(Buffer b){
        this.b=b;
    }
    
    public void run(){
       for(int i=0;i<Buffer.size;i++){
            b.produce();
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
        }
    }
}

class Consumer extends Thread{
    Buffer b;
    Consumer(Buffer b){
        this.b=b;
    }

    public void run(){
        for(int i=0;i<Buffer.size;i++){
            b.consume();
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}

public class Program4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the buffer :");
        int s= sc.nextInt();
        Buffer b=new Buffer(s);
        Producer p=new Producer(b);
        Consumer c=new Consumer(b);
        p.start();
        c.start();
    }
}
