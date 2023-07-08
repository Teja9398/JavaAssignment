import java.io.*;

public class FileD {
    public static void main(String[] args) {
        File f=new File(args[0]);
        try{
            FileReader fr= new FileReader(f);
           StringBuffer sb=new StringBuffer();
            int k,pos=Integer.parseInt(args[1]),count=0;
            while((k=fr.read())!=-1){
                if (count==pos){
                    sb.append(args[2].charAt(0));
                }else{
                    sb.append((char)k);
                }
                count++;
            }
           FileWriter pw=new FileWriter(f);
            System.out.println("after changing the character at "+args[1]+" "+sb);
            pw.write(sb.toString());
            pw.flush();
          fr.close();pw.close();
            
        }catch(IOException io){
            System.out.println("some error occured");
            io.printStackTrace();
        }
        
    }
}
