import java.io.*;
import java.util.*;
public class FileF{
    static void Bsort(ArrayList<Integer> a){
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size()-i-1;j++){
                if(a.get(j)>a.get(j+1)){
                    int temp=a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        File f1=null,f2=null;
        try{
            f1=new File(args[0]);
            f2=new File(args[1]);
            Scanner sc =new Scanner(f1);
            ArrayList<Integer> list=new ArrayList<>();
            while(sc.hasNextInt()){
                list.add(sc.nextInt());
            }
           Bsort(list);
           PrintWriter pw = new PrintWriter(f2);
           int i=0;
           while(i<list.size()){
            pw.print(list.get(i)+" ");
            i++;
           }
        //    pw.println(list);
           pw.flush();
           pw.close();
           sc.close();

        }catch(IOException io){
            System.out.println("an error occured!!");
            io.printStackTrace();
        }
    }
}