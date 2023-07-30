/*5.   Write a Java program to perform the following:
       i)Create a LinkedList collection containing the following string objects(colors):
          red , blue, green, yellow, black.
      ii)Sort the colors in ascending order and then search for a color(key) in the
         sorted list of colors using binary search. Display appropriate message.
 */
import java.util.*;
public class Program5 {

    static void binSearch(List<String> list,String key){
        int high=list.size()-1,low=0;
        while(high>=low){
            int mid=(high+low)/2;
            if(list.get(mid).equalsIgnoreCase(key)){
                System.out.println("'"+key+"'"+" found at index: "+mid);
                break;
            }else if(key.compareTo(list.get(mid))<0){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();
        System.out.println("enter the colors in a single line: ");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        System.out.println(list);
        // System.out.println(list.get(2));
        binSearch(list,"green");
        sc.close();
    }
}
