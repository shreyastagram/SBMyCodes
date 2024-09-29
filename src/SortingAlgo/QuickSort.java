package SortingAlgo;
import java.util.Arrays;
import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,arr.length-1);
        printArray(arr);
    }
    public static void quicksort(int[] arr,int start,int end){
        if(start<end){
            int p=partition(arr,start,end);
            quicksort(arr,0,p-1);
            quicksort(arr,p+1,end);
        }
    }
    public static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int p=start;
        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                int temp=arr[j];
                arr[j]=arr[p];
                arr[p]=temp;
                p++;
            }
        }
        int temp2=arr[p];
        arr[p]=arr[end];
        arr[end]=temp2;

        return p;
    }
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }System.out.println();
    }
}
