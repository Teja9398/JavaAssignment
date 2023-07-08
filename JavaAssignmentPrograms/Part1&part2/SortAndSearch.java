import java.util.Scanner;
public class SortAndSearch {
    public static void bSort(int []ar){
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }

            }
        }
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static void bSearch(int []a,int key){
        // int min=0,max=arr.length-1,mid;
        // while(max<=min){
        //     mid=(max+min)/2;
        //     if(key<arr[mid])
        //         max=mid-1;
        //     else if(key>arr[min])
        //         min=mid+1;
        //     else if(key==arr[mid]){
        //         System.out.println("found at: "+mid);
        //         break;
        //     }
        //     else{
        //             System.out.println("element not found.");}
            

        // }
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
        bSort(arr);
        System.out.println("after soring :");
        printArray(arr);
        System.out.println("enter the key element to be searched:");
        int key=sc.nextInt();
        bSearch(arr, key);
        sc.close();
    }
}
