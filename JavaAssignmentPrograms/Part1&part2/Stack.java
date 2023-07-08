import java.util.Scanner;

public class Stack {
    int size;
    int top=-1;
    int[] arr ;
    Stack(int s){
        size=s;
        arr=new int[size];
    }

    boolean isEmpty(){
        if(this.top==-1)
            return true;
        else
            return false;
    }

    boolean isFull(){
        if(this.top>=this.size){
            return true;
        }
        else 
            return false;
    }

    void push(int a){
        ++top;
        if(isFull()){
            System.out.println("Stack overflow!!-Cannot push the element.");
            top--;
            return;
        }
        else{
            arr[top]=a;
            System.out.println("pushed '" +a+"' into Stack");
        }
    }

    void pop(){
        if(this.isEmpty()){
            System.out.println("stack is empty!!");
        }else{
            System.out.println("poped '" +arr[top]+"' from Stack");
            --top;
        }
    }
    void displayStack(){
        if(isEmpty()){
            System.out.println("No elements in the stack!");
        }else{
            System.out.println("elements in the stack: ");
            for(int i=top;i>=0;i--){
                System.out.println("\t"+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the Stack: ");
        int S=sc.nextInt(),choice;
        Stack s=new Stack(S);
        do{
            System.out.println(":::enter operarion to be performed:::\n\t1.push\n\t2.pop\n\t3.Display\n\t4.exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                        System.out.println("enter the integer to be pushed: ");
                        s.push(sc.nextInt());
                        System.out.println(":::::::::::::::::::::::::::::::::::::");
                        break;
                case 2:
                            s.pop();
                            System.out.println(":::::::::::::::::::::::::::::::::::::");
                        break;
                case 3: 
                       s.displayStack();
                        break;
                case 4:
                        System.exit(0);
            }
            
        }while(true);
        
    }

}
