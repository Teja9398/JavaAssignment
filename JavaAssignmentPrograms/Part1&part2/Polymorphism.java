import java.util.Scanner;

abstract class Polygon{
    abstract double area();
    abstract double perimeter();
}

class Square extends Polygon{
    double side;
    Square(){
        side=0.0;
    }
    Square(double a){
        side=a;
    }
    double area(){
        return side*side;
    }
    double perimeter(){
        return 4*side;
    }
}

class Rectangle extends Polygon{
    double length,width;
    Rectangle(){
        length=0.0;width=0.0;
    }
    Rectangle(double a,double b){
        length=a;width=b;
    }
    double area(){
        return length*width;
    }
    double perimeter(){
        return 2*(length+width);
    }
}

class Triangle extends Polygon{
    double a,b,c;
    Triangle(){
        a=b=c=0.0;
    }
    Triangle(double x,double y,double z){
        a=x;b=y;c=z;
    }
    double area(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double perimeter(){
        return a+b+c;
        
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter choice:\n1.Square\n2.Rectangle\n3.Triangle\n4.Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                        System.out.println("enter the side of the square");
                        double s=sc.nextDouble();
                        Square sq = new Square(s);
                        System.out.println("perimeter of the Square: "+sq.perimeter());
                        System.out.println("area of the square :"+sq.area());
                        break;
                case 2: 
                        System.out.println("enter the length and width of the Rectangle");
                        double l=sc.nextDouble(),w=sc.nextDouble();
                        Rectangle r = new Rectangle(l, w);
                        System.out.println("perimeter of the Rectangle: "+r.perimeter());
                        System.out.println("area of the Rectangle :"+r.area());
                        break;
                case 3: 
                        System.out.println("enter the sides of the triangle: ");
                        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
                        Triangle t = new Triangle(a,b,c);
                        System.out.println("area of the Triangle :"+t.area());
                        System.out.println("perimeter of the Triangle: "+t.perimeter());
                        break;

                case 4:
                        System.out.println("TERMINATED...");
                        sc.close();
                        System.exit(0);
            }

        }while(true);
        
    }
}
