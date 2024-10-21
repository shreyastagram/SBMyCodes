package heap;
import java.util.Arrays;
import java.util.*;

public class maxToMinHeap {
    public static int leftChild(int i){//finds the index of left child
        return 2*i+1;
    }
    public static int rightChild(int i){//finds the index of right child
        return 2*i+2;
    }
    public static void heapify(int[] arr,int i,int n){
        int l=leftChild(i);
        int r=rightChild(i);

        int smallest=i;

        if(l<n && arr[l]<arr[smallest]){//checks if left child is within bounds and smaller than current node
            smallest=l;
        }
        if(r<n && arr[r]<arr[smallest]){//checks if right child is within bounds and smaller than current node
            smallest=r;
        }
        if(smallest != i){//checks if smallest is not eql to i and swaps i and smallest if condition is true and
            //calls heapify on the smallest
            swap(arr,i,smallest);
            heapify(arr,smallest,n);
        }
    }

    public static void swap(int[] arr,int i,int j){//swap smallest and i
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void buildHeap(int[] arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,i,n);

        }
    }

        public static int[] getInputArray(int size,Scanner sc){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
        }

        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=getInputArray(size,sc);

        buildHeap(arr);
        System.out.println(Arrays.toString(arr));
        }
}
