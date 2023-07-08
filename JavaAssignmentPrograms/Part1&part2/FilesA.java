
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class FilesA {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a file name");
        String name=sc.next();
        File f=new File(name);
        if(f.exists()){
            System.out.println("File exists.");
            if(f.canRead()){
                System.out.println("file is readable!!");
            }else{
                System.out.println("File is not readable");
            }
            if(f.canWrite()){
                System.out.println("file is Writable");
            }else System.out.println("file is not Writable!!");
            System.out.println("File type: "+Files.probeContentType(f.toPath()));
            System.out.println("length of the file : "+f.length()+"bytes");
        }else{
            System.out.println("File dosen't exist!!");
        }
        sc.close();
    }
    
}
