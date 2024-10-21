package DSAquestions;
import java.util.*;
public class sortArray {//in this we have to sort the array in k steps achieving O(n log k ) time complexity

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        arraySort(arr, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Method to sort the k-sorted Array
    public static void arraySort(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //Insert the first k+1  elements into the min-Heap
        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        int index = 0;//Index to place sorted elements back into the array

        //Process the remaining elements
        for (int i = k + 1; i < arr.length; i++) {
            //place the smallest element from the heap to the array
            Integer smallest=minHeap.poll();
            if(smallest!=null){
                arr[index++] = smallest;//safe to unbox
            }
            else{
                System.out.println("Warning: min-heap is unexpectedly empty.");
                break;//Exit the loop if you unexpectedly encounter empty heap
            }
            //Add the current element to the heap
            minHeap.add(arr[i]);
        }

        //Place remaining elements from the heap into the array
        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();

        }
    }
}
