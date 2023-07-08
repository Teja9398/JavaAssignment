/* 
1.Write a Java program to perform the following:
    i)Create a LinkedList collection containing the following string objects(colors):
       red , blue, green, yellow, black.
   ii)Using an iterator, scan the above list and remove all elements(colors) that have
       a string length of less than 5.
*/


import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        List<String>list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the colors: ");
        String s=sc.nextLine();
        String s2[]=s.split(" ");
            for(int i=0;i<s2.length;i++)
            list.add(s2[i]);
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String item=it.next();
            if(item.length()<5){
                System.out.println(item);
            }
        }
        sc.close();
    }
}
