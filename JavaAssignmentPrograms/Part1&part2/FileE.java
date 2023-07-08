import java.io.*;
import java.util.Scanner;
public class FileE {
    public static void main(String[] args) {
       File f1=null,f2=null;
       Scanner sc=null;
       try{
        f1=new File(args[0]);
        f2=new File(args[1]);
        sc=new Scanner(f1);
        StringBuffer buffer = new StringBuffer();
        while(sc.hasNextLine()){
            buffer.append("\n"+sc.nextLine());
        }
        PrintWriter pw = new PrintWriter(f2);
        pw.println(buffer);
        pw.flush();
        pw.close();
        sc.close();
        System.out.println("copied contents of "+f1.getName()+" to "+f2.getName());

       }catch(FileNotFoundException fnf){
        System.out.println("file Dosen't exist!!");
       }
       
        
    }
}
