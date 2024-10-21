package heap;
import java.util.*;

public class decHeapSort {
    public static int leftChild(int i){
        return 2*i+1;
    }
    public static int rightChild(int i){
        return 2*i+2;
    }
    public static void heapSort(int[] arr,int n){///Heapsort function
        buildHeap(arr,n);//Build max heap

        //Extract elements from the heap one by one
        for(int i=n-1;i>=0;i--) {
            swap(arr, 0, i);//Swap the current root with the last element in the unsorted section

            heapify(arr, 0, i);//Heapify the reduced heap
        }
    }
    public static void heapify(int[] arr,int i,int n){
        int smallest=i;
        int l=leftChild(i);
        int r=rightChild(i);

        if(l<n && arr[l]<arr[smallest]){//If the left child is larger than the root
            smallest=l;
        }
        if(r<n && arr[r]<arr[smallest]){//If the right child is larger than the root
            smallest=r;
        }
        if(smallest!=i){//If the larger is not the root,swap and continue heapifying
            swap(arr,i,smallest);
            //Recursively heapify the affected subtree
            heapify(arr,smallest,n);
        }
    }

    public static void buildHeap(int[] arr,int n){//Function to build the max-heap

        //Start heapifying from the last non-leaf node down to the root
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,i,n);
        }
    }
    public static void swap(int[] arr,int i,int j){//Swap function to swap two indices in the array
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //Utility function to take input array from user
    public static int[] getInput(int size,Scanner sc){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=getInput(size,sc);

        heapSort(arr,size);
        System.out.println(Arrays.toString(arr));
    }
}
