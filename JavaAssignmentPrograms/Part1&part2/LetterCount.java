
import java.util.Scanner;

public class LetterCount {

    static void letterCount(String s){
        for (int i=0;i<s.length();i++){
            int count =0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            System.out.println("count of \'"+s.charAt(i)+"\' :"+count);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();
        letterCount(s);
        sc.close();
    }
}
