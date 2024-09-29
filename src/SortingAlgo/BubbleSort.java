package SortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The unsorted array is"+ Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("The sorted array is"+Arrays.toString(bubblesort(arr)));

    }
    public static int[] bubblesort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j]<arr[j-1]){
                    swap(j-1,j,arr);
                }
            }
        }
        return arr;
    }
    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
