import java.util.*;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the values ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
       System.out.println(max.maximum(a, b)+" is maximum of "+a+" "+b);
       System.out.println(max.maximum(a, c)+" is maximum of "+a+" "+c);
       System.out.println(max.maximum(b, c)+" is maximum of "+b+" "+c);
       System.out.println(max.maximum(a, b, c)+" is maximum among all the 3 numbers");
       sc.close();
 

    }
}
class max{
    static int maximum(int a, int b){
      int max= a>b?a:b;
      return max;
    }
    static int maximum(int a,int b, int c){
        int max=a>b&&a>c?a:b>c&&b>a?b:c;
        return max;
    }
}
