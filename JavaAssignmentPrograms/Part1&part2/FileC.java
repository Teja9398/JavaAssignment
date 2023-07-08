import java.io.*;
import java.util.Scanner;

public class FileC{
    public static void main(String[] args) {
        FileReader fr= null;
        Scanner sc=null;
        try{
            fr=new FileReader("Fibonacci.java");
            int count=0;
            while(fr.read()!=-1){
                count++;
            }
            fr.close();
            System.out.println("count of characters: "+count);

            fr=new FileReader("Fibonacci.java");
            sc= new Scanner(fr);
            count=0;
            while(sc.hasNext()){
                count++;
                sc.next();
            }
            System.out.println("count of words: "+count);
            sc.close();
            fr.close();
            fr=new FileReader("fibonacci.java");
            sc=new Scanner(fr);
            count =0;
            while(sc.hasNextLine()){
                count++;
               sc.nextLine();
            }
            System.out.println("count of lines: "+count);
              
        } catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
        finally{
            if(sc!=null) sc.close();
        }
    }
}