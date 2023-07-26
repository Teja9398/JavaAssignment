class Thread1 implements Runnable{
	public void run() {
		for (int i=0;i<6;i++) 
			System.out.println("JAVA");		
	}
}
class Thread2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("PROGRAMMING");
	}
}
public class Program4_1 {
	public static void main(String[] args) {
		
		Thread1 r1=new Thread1();
		Thread2 r2=new Thread2();
		Thread t2=new Thread(r2);
		Thread t1=new Thread(r1);
		t1.start();
		t2.start();
	}
	
}
