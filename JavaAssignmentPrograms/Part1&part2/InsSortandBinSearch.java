import java.util.Scanner;

public class InsSortandBinSearch {
    static void insSort(int [] arr){
        for(int i=1;i<=arr.length-1;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    } 

    static void recBinSearch(int[] arr,int key,int min,int max){
       int mid= (min+max)/2;
       if(key==arr[mid]){
        System.out.println("found at index:"+mid);
        return;
       }
       if(min>max){
        System.out.println("element not found!!");
        return;
       }
       if(key<arr[mid]){
        recBinSearch(arr, key, 0, mid-1);
       }else if(key>mid){
        recBinSearch(arr, key, mid+1, max);
       }
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] ar= new int[size];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("before sort");
        printArray(ar);
        insSort(ar);
        System.out.println();
        System.out.println("after sort:");
        printArray(ar);
        System.out.println("enter the key element to be searched:");
        int key =sc.nextInt();
        recBinSearch(ar, key, 0, ar.length-1);
        sc.close();
    }
}
