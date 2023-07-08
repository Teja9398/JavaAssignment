

public class CmdSort{
    static void bSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        System.out.println("before sorting:");
        printArray(arr);
        bSort(arr);
        System.out.println("after sorting:");
        printArray(arr);
    }
}