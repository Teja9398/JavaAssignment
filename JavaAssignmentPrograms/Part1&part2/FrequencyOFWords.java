import java.util.Scanner;
import java.util.StringTokenizer;


public class FrequencyOFWords {

    static void frequency(String []s){
        for(int i=0;i<s.length;i++){
            int count=0;
            for(int j=0;j<s.length;j++){
                if(s[i].equalsIgnoreCase(s[j])){
                    count++;
                }
            }
            System.out.println("count of \'"+s[i]+"\' :"+count);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string: ");
        String s =new String(); 
        s=sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        String[] words =new String[st.countTokens()];
        for(int i=0;i<words.length;i++){
            words[i]=st.nextToken();
        }
        frequency(words);
        sc.close();
    }
}
