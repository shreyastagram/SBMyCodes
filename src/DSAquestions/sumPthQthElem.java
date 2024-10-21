package DSAquestions;
import java.util.*;
public class sumPthQthElem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int Pth=sc.nextInt();
        int Qth=sc.nextInt();
        System.out.println(sumBetweenPthToQthSmallestElement(arr,Pth,Qth));
    }

    public static int sumBetweenPthToQthSmallestElement(int[] arr,int p,int q){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int first;
        int second;
        if(p<q){
            first=p-1;
            second=q-1;
        }
        else{
            first=q-1;
            second=p-1;
        }

        for(int j:arr){
            minHeap.add(arr[j]);
        }
        int addition=0;
        for(int i=0;i<arr.length;i++){
            int elem=minHeap.poll();
            if(i==first){
                addition=elem;
            }
            if(i==second){
                addition=elem+addition;
            }
        }
        return addition;
    }
}
