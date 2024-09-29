package SortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortRev {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MergeSortRev ob=new MergeSortRev();
        ob.sort(arr,0,n-1);
        printArray(arr);
    }
    void sort(int[] arr,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    void merge(int[] arr,int start,int mid,int end){
        int LeftLength=mid-start+1;
        int RightLength=end-mid;

        int[] L=new int[LeftLength];
        int[] R=new int[RightLength];

        for(int i=LeftLength-1;i>=0;i--){
            L[i]=arr[start+i];
        }
        for(int j=RightLength-1;j>=0;j--){
            R[j]=arr[mid+j+1];
        }

        int l=0;int r=0;
        int k=start;
        while(l<LeftLength&&r<RightLength){
            if(L[l]>=R[r]){
                arr[k]=L[l];
                l++;
            }
            else{
                arr[k]=R[r];
                r++;
            }
            k++;
        }
        while(l<LeftLength){
            arr[k]=L[l];
            l++;
            k++;
        }
        while(r<RightLength){
            arr[k]=R[r];
            r++;
            k++;
        }
    }
    static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
