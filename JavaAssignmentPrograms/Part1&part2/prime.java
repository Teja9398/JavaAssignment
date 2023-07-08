// program that prompts the user for an integer and then prints out all prime numbers up to that integer4

import java.util.*;

public class prime {
    public static void printPrime(int n){
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
               System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the n value");
        int n =input.nextInt();
        input.close();
        System.out.println("prime numbers between 1 to "+n+" are:");
        printPrime(n);
        
    }
}
