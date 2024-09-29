package Hashing;
import java.util.HashMap;
public class commonTerms {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={1,2,3,6,7,8,4};

        HashMap<Integer,Integer> cT=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            cT.put(arr1[i],i);
        }
        for(int i=0;i<arr2.length;i++){
            if(cT.containsKey(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }
}
