import java.util.*;
public class MInMax {
    static void minMax(int arr[]){
        int min=arr[0],max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("minimum element in the given array is \'"+min+"\'' maximum element is \'"+max+"\'");
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=input.nextInt();
        int[] a=new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
            a[i]=input.nextInt();
        }
        minMax(a);
        input.close();
    }
}
