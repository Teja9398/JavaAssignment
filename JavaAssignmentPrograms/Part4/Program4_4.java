import java.util.Scanner;

class Buffer{
    int size;
    protected int i=0;

    Buffer(int size){
        this.size=size;
    }
    
    public synchronized void produce(){
        if(i>=size){
            System.out.println("Buffer is full,waiting to consume...");
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
            System.out.println("Buffer is empty, waiting to produce...");
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        System.out.println("consumed: "+i);
        i--;
        notify();

    }
}


class Producer extends Thread{
    Buffer b;
    Producer(Buffer b){
        this.b=b;
    }
    public void run(){
       for(int i=0;i<=b.size;i++){
            b.produce();
        }
    }
}


class Consumer extends Thread{
    Buffer b;
    Consumer(Buffer b){
        this.b=b;
    }
    public void run(){
        for(int i=0;i<=b.size;i++){
            b.consume();
            try{
                Thread.sleep(500);
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
        sc.close();
    }
}
