package Hashing;
import java.util.HashMap;
public class majElem {
    public static void main(String[] args){
        int[] arr={2,2,2,2,2,2,1,1,1,1,1,1,1,1};
        HashMap<Integer,Integer> mapp=new HashMap<>();
        int n=arr.length/2;

        for(int i=0;i<arr.length;i++){
            mapp.put(arr[i],mapp.getOrDefault(arr[i],0)+1);
            int value=mapp.get(arr[i]);
            if(value>=n){
                System.out.println("The key:- "+arr[i]+ " is the major elem.");
                break;
            }

        }
    }
}
