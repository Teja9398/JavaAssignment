import java.util.Scanner;

public class LinearSearch{
    static void recLinearSearch(char []ar,char key,int index){
        if(index>=ar.length){
            System.out.println("element not found ");
            return;
        }
        if (ar[index]==key){
            System.out.println("found at: "+index);
            return;
        }
        recLinearSearch(ar, key, index+1);
    }
    static void linearSearch(char []a ,char key){
        int i=0;
        boolean found=false;
        while(!found&&i<a.length){
            if(key ==a[i]){
                found =true;
                System.out.println("element found at index: "+i );
            }
            i++;
        }
        if(found==false){
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = sc.nextInt();
        char [] arr=new char[size];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("enter the key element to be searched:");
        char key = sc.next().charAt(0);
        // recLinearSearch(arr, key, 0);
        linearSearch(arr, key);
        sc.close();
    }
}