import java.io.*;

public class FileD {
    public static void main(String[] args) {
        File f=new File(args[0]);
        try{
            FileReader fr= new FileReader(f);
           FileWriter fw=new FileWriter(f);
            int k,pos=Integer.parseInt(args[1]),count=0;
            while((k=fr.read())!=-1){
                count++;
                if (count==pos){
                    fw.write(args[2]);
                }else{
                    fw.write((char)k);
                }

            }
            fw.flush();
          fr.close();fw.close();
            
        }catch(IOException io){
            System.out.println("some error occured");
            io.printStackTrace();
        }
        
    }
}
