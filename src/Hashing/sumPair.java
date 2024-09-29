package Hashing;
import java.util.HashMap;
public class sumPair {
    public static void main(String[] args){
        HashMap<Integer,Integer> mapp=new HashMap<>();
        int[] arr={1,2,6,8,9,10,45};
        int count=0;
        int target=4;
        for(int i=0;i<arr.length;i++){
           int elem=target-arr[i];
           if(mapp.containsKey(elem)){
               count++;
           }
               mapp.put(arr[i],mapp.getOrDefault(arr[i],0)+1);
        }
        System.out.println(count);
    }
}
