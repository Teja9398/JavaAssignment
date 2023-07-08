/*
6.    Write a Java program that counts the occurrences of words in a text and
       displays the words and their occurrences in alphabetical order of words.
       Hint:Use a TreeMap to store an entry consisting of a word and its count.
 */

import java.util.*;
public class Program6 {
    static void countFrequency(String [] s,TreeMap<String,Integer> m){
        for(int i=0;i<s.length;i++){
            int count=0;
            for(int j=0;j<s.length;j++){
                if(s[i].equalsIgnoreCase(s[j])){
                    count++;
                }
            }
            m.put(s[i],count);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any Text: ");
        String text=sc.nextLine();
        StringTokenizer st= new StringTokenizer(text);
        String[] words=new String[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens()){
            words[i]=st.nextToken();
            i++;
        }
        TreeMap<String,Integer> wordCount=new TreeMap<>();
        countFrequency(words, wordCount);
        System.out.println(wordCount);
       sc.close();
    }    
}
