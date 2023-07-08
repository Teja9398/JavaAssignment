import java.util.Scanner;
public class Fibonacci {
    static void fibonacci(int n){
        int a=0,b=1,c=0;
        for (int i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println(c);
    }
    static int recFibonaci(int n){
        if(n==1||n==2){
            return 1;
        }

        return recFibonaci(n-1)+recFibonaci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = sc.nextInt();
        System.out.print( "term no. " + n +" WITHOUT using Recursion :");
        fibonacci(n);
        System.out.println("term no. "+ n+ " using recursion: "+recFibonaci(n));
        sc.close();
    }
}
