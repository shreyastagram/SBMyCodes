package DSAquestions;
import java.util.Scanner;
import java.util.HashMap;

public class mostFreqEle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(mostFrequentElement(arr));
    }
    public static int mostFrequentElement(int[] arr){
        //Hashmap to store the frequency element
        HashMap<Integer,Integer> freqMap=new HashMap<>();

        //Traverse the array and count the frequency
        for(int num:arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        //Find the element with the maximum frequency
        int mostFrequent=arr[0];
        int maxCount=0;

        //checking every keys value with maxCount and updating the value if  any keys value is greater than
        //maxCount
        for(HashMap.Entry<Integer,Integer> entry:freqMap.entrySet()){
            if(entry.getValue() > maxCount){
                mostFrequent=entry.getKey();
                maxCount=entry.getValue();
            }
        }
        return mostFrequent;
    }
}
