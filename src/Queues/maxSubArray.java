package Queues;
import java.util.*;
public class maxSubArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int g=sc.nextInt();

        max(n,arr,g);
    }
    public static void max(int n,int[] arr,int g){
        int l =arr.length;
        if(l==0){
            System.out.println("the array is empty");
            return;
        }
        if(g>n){
            System.out.println("the size of the subgroup exceeds the number of elements in the array");
            return;
        }
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<g;i++){
            while(!deque.isEmpty() && arr[deque.peekLast()]<=arr[i]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        for(int i=g;i<n;i++){
            System.out.print(arr[deque.peekFirst()]+" ");
            while(!deque.isEmpty() &&deque.peekFirst()<=i-g){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && arr[deque.peekLast()]<=arr[i]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        System.out.println(arr[deque.peekFirst()]);


    }
}
