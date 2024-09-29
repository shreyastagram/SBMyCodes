package SortingAlgo;
import java.util.Arrays;
import java.util.Scanner;
public class InsertSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemnts of array...");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of Array...");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The unsorted array is "+Arrays.toString(arr));
        System.out.println("The Sorted Array is "+Arrays.toString(insertsort(arr)));
    }
    public static int[] insertsort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j=j-1;
            }
        }
        return arr;
    }
}

