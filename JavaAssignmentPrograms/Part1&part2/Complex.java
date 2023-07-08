
import java.util.*;

public class Complex {
    int real,img;
    
    void readComplex() {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the real part ");
        this.real=input.nextInt();
        System.out.println("enter the imaginary part ");
        this.img=input.nextInt();  

    }
    void writeComplex(){

        if(this.img>0)
            System.out.println(this.real+"+"+this.img+"i");
        else
            System.out.println(this.real+" "+this.img+"i");
        
    }
    void addComplex(Complex c){
        Complex result=new Complex();
        result.real=this.real+c.real;
        result.img=this.img+c.img;
        System.out.println("after addition:");
        result.writeComplex();
    }
    void multiplyComplex(Complex c){
        Complex result =new Complex();
        result.real=this.real*c.real-(this.img*c.img);
        result.img=this.real*c.img+this.img+c.real;
        System.out.println("after multiplication :");
        result.writeComplex();
    }
   
    public static void main(String[] args) {
        System.out.println("first number :");
        Complex c1 = new Complex();
        c1.readComplex();
        System.out.println("second number");
        Complex c2=new Complex();
        c2.readComplex();
        Scanner Sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("enter\n1.for Addition\n2.for multiplication\n3. To exit");
            choice=Sc.nextInt();
            switch(choice){
                case 1:c1.addComplex(c2);
                        break;
                case 2:c1.multiplyComplex(c2);
                        break;
                default:
                        Sc.close();
                        System.exit(0);
            }
        }while(true);
    }
}
    

