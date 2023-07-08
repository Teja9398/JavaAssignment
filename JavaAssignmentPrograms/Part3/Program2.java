/*
 2.Write a Java program to perform the following:
     i)Create an ArrayList collection containing the following string objects(colors):
        red, blue, green, yellow, black.
    ii)Use foreach statement that scans the above list and outputs the
        elements(colors).
  iii)Using an appropriate iterator, replace the string, “yellow” with string “purple”
       in the above list.
*/


import java.util.*;

public class Program2 {
    static <T> void printList(List<T> lst){
        for(T temp:lst){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements: ");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        System.out.println("elements in the list: ");
        printList(list);
        ListIterator <String>it=list.listIterator();
        boolean done=false;
        while(it.hasNext()){
            
            if(it.next().equalsIgnoreCase("yellow")){
                list.set(list.indexOf("yellow"),"purple");
                done=true;
            } 
        }
        if(!done){
            System.out.println("No such element in the list");
        }else{
            System.out.println("after alteration: ");
            printList(list);
        }
        sc.close();
    }
}
