
import java.io.*;
import java.util.Scanner;


public class FileB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the file: ");
        File f1=null;
        Scanner fr=null;
        try{
            f1=new File(sc.next());
            fr=new Scanner(f1);
            int i=1;
            System.out.println(":::::::::::CONTENTS OF THE FILE:::::::::::::");
            while(fr.hasNextLine()){
                System.out.println(i+"."+fr.nextLine());
                i++;
            }
        }catch(FileNotFoundException fnf){
            System.out.println("File not Found!!!");
            fnf.printStackTrace();
        }catch(IOException io){
            System.out.println("An Unknown IO error occured");
            io.printStackTrace();
        }catch(Exception e){
            System.out.println("Unknown Error Occured!!!");
            e.printStackTrace();
        }
        finally{
            if(fr!=null){
                fr.close();
            }
            sc.close();
        }
        
    }
}
