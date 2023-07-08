import java.util.Scanner;

public class LinkedListt{
    Node head;
    
    class Node{
        int data;
        Node link;
        Node(int a){
            this.data=a;
            this.link=null;
        }
    }

    LinkedListt(){
        head=null;
    }
    
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            // System.out.println("inserted "+data+" into the list");
        }
        else{
            Node temp=head;
            while(temp.link!=null){
                temp=temp.link;
            }
            temp.link=newNode;
            System.out.println("inserted "+data+" into the list");
        }
    }

    boolean delete(int key){
        Node temp=head,prev=null;
        boolean flag=false;
        while(temp.data!=key&&temp.link!=null){
            prev=temp;
            temp=temp.link;
        }
        if(head.data==key){
            head=temp.link;
            System.out.println("Deleted "+key);
            flag= true;
        }else if(temp.data==key){
            prev.link=temp.link;
            System.out.println("Deleted "+key);
            flag =true;
        }else if(temp.data!=key&&temp.link==null){
            System.out.println("No such element in the list");
        }
        return flag;
    }

    void getList(){
        Node temp=head;
        System.out.println("elements in the list: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
     LinkedListt list=new LinkedListt();
    Scanner sc = new Scanner(System.in);
    int choice;
    do{
        System.out.print("\n1.insert element\n2.show elements\n3.delete elements\n4.Exit\nENTER CHOICE ");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter the integer to be inserted: ");
                list.insert(sc.nextInt());
                break;
            case 2:
                list.getList();
                break;
            case 3:
                System.out.println("Enter the element to be deleted: ");
                if(list.delete(sc.nextInt())){
                    System.out.println("after deletion: ");
                    list.getList();
                }
                break;
            case 4:
                sc.close();
                System.exit(0);
                
        }
    }while(true);
     
    }
}