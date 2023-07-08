import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        boolean flag =true;
        while(l<=r){
            if(flag==true&&s.charAt(l)==s.charAt(r)){
                flag=true;
            }else{
                flag=false;
            }
            l++;
            r--;
        }
       return flag;
    }

    static boolean recPalindrome(String s,int left,int right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        if (left<right){
            recPalindrome(s, left+1, right-1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string");
        String s = new String(sc.nextLine());
        if(recPalindrome(s,0,s.length()-1)){
            System.out.println("it's a Palindrome!!");
        }else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
