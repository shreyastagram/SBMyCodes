import java.util.*;
import java.util.Scanner;
public class priorityqueue {
    public static void PQimplement(int[] arr,int M){
        //it creates a priority queue and inserts all elements into the priority queue
        PriorityQueue<Integer> priorqueue=new PriorityQueue<>();
        for(int x:arr){
            priorqueue.add(x);
        }
        //Find the smallest element
        System.out.println(priorqueue.peek());

        //Find and remove the top M least element
        while(M-- > 0){
            System.out.println(priorqueue.poll());
        }
        Iterator<Integer> itr=priorqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
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
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] arr=getArrayInput(N,sc);
        PQimplement(arr,M);
    }
}
