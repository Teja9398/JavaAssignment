/*4.  Write a Java program to perform the following:
      i)Create a HashMap that contains 4 mappings of student names and their end
        marks in a subject.
     ii)Obtain a set view of the mappings. Then traverse the set using an iterator and
        display the contents of the map.
 */

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("stu1",95);
        hm.put("stu2",89);
        hm.put("stu3",85);
        hm.put("stu4",91);
        Set<Map.Entry<String,Integer>> ens=hm.entrySet();
        Iterator<Map.Entry<String,Integer>> it =ens.iterator();
        System.out.println("Contents of the map: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
