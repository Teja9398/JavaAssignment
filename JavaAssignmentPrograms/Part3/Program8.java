/*8.  Write a Java program to perform the following:
         i)Create a PriorityQueue collection and add the following string
            objects(colors) in the order given:
                 red , blue, green, yellow, black.
        ii)Use an appropriate iterator, traverse the above PriorityQueue and display
            the contents.
        iii)Remove the elements(string objects(colors)) from the above PriorityQueue
            and display them.
 */

 import java.util.*;
public class Program8 {
    public static void main(String[] args) {
        PriorityQueue <String> Q =new PriorityQueue<>();
        Q.add("red");
        Q.add("blue");
        Q.add("green");
        Q.add("yellow");
        Q.add("black");
        System.out.println("Elements in the queue:");
        Iterator<String> it= Q.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
        System.out.println("\n'"+Q.remove()+"' has been removed from the Queue");
        System.out.println("After removing : "+Q);
    }

}
