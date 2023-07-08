/*
3. Write a Java program to perform the following:
     i)Create a LinkedList collection containing the following string objects(colors):
       red , blue, green, yellow, black.
    ii)Using a ListIterator, scan the above list in the reverse order(ie. from last to
       first) and remove all elements(colors) that have a string length of less than 5.
 */


import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        List<String>list=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements: ");
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str);
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        ListIterator <String>it=list.listIterator(list.size());
        System.out.println("elements entered in reverse Order: ");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        while(it.hasNext()){
            String temp=it.next();
            if(temp.length()<5){
                it.remove();
            }
        }
        sc.close();
        System.out.println("after alteration: "+list);
    }
}
