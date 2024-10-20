package heap;
import java.util.Scanner;

public class isMaxHeap {
    public static boolean isHeap(int[] arr,int n) {//checks whether the given array is a binary max heap or not
        for (int i = 0; i <= (n-2)/2; i++) {//checks for (n-2)/2 elements
            if(2*i+1<n){//checks if the index going to be checked is higher than the size of array

                if(arr[2*i+1]>arr[i]){//checks whether left child is greater than the parent if it is true then
                    //it violates the max heap property
                    return false;
                }
            }
            if(2*i+2<n){
                if(arr[2*i+2]>arr[i]){//checks whether right child is greater than the parent if it is true then
                    //it violates the max heap property
                    return false;
                }
            }
        }
        return true;
    }
    public static int[] getArrayInput(int size,Scanner sc){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=getArrayInput(size,sc);
        int n=arr.length;
        String x=isHeap(arr,n)? "Yes":"No";//ternary operator to assign x the value true if isHeap is true and v.v.
        System.out.println(x);
    }
}
