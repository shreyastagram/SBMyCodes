package Hashing;
import java.util.HashSet;
import java.util.Scanner;
public class sumPair2 {
    public static void main(String[] args){
        HashSet<Integer> mapp=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mapp.add(arr[i]);
        }
        int target=sc.nextInt();
        boolean contains=false;
        for(int i=0;i<arr.length;i++){
            int elem=target-arr[i];
            if(mapp.contains(elem)){
                contains=true;
                break;
            }
        }
        System.out.println(contains);
    }
}
