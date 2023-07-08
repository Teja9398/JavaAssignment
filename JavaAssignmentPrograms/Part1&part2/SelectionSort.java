import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp= arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }

    static void BinSearch(int a[],int key){
        int high=a.length-1,low=0;
        boolean found=false;
        while(low<=high&&found!=true){
            int mid=(high+low)/2;
            if(key==a[mid]){
                System.out.println("found at index:"+mid);
                found = true;
                break;
            }
            if(key<a[mid]){
                high=mid-1;
            }else if(key>mid){
                low=mid+1;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int []arr=new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("before sorting:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("after soring :");
        printArray(arr);
        System.out.println("enter the key element to be searched:");
        int key=sc.nextInt();
        BinSearch(arr, key);
        sc.close();
    }
}
