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

        //ensure p is smaller index
        int first=Math.min(p,q);
        int second=Math.max(p,q);


        for(int j:arr){
            minHeap.add(j);
        }

        int sum=0;
        for(int i=1;i<=second;i++){
            int current=minHeap.poll();
            if(i>first && i<second){
                sum+=current;
            }
        }
        return sum;
    }
}
