/*
 * 7.    Write a Java program to perform the following:
         i)Create a TreeSet collection containing the following string objects(colors):
            red , blue, green, yellow, black.
        ii)Use an appropriate iterator, traverse the above TreeSet and display the
            contents.

 */
import java.util.*;
public class Program7 {
    public static void main(String[] args) {
        TreeSet<String> ts =new TreeSet<String>();
        ts.add("red");
        ts.add("blue");
        ts.add("green");
        ts.add("yellow");
        ts.add("black");
        Iterator <String>it=ts.iterator();
        System.out.println("elements in the set: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
