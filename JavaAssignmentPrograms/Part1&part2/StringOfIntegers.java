import java.util.Scanner;
import java.util.StringTokenizer;

public class StringOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = new String();
        System.out.println("enter the string of numbers: ");
        numbers=sc.nextLine();
        StringTokenizer st= new StringTokenizer(numbers);
        int[] arr=new int[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens()){
            arr[i]=Integer.parseInt(st.nextToken());
            i++;
        }
        int sum=0;
        System.out.println("entered numbers: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("sum of the above numbers: "+sum);



    }
}
