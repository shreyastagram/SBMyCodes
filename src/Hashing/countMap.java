package Hashing;
import java.util.HashMap;
public class countMap {
    public static void main(String[] args){
        HashMap<Character,Integer> countMapp=new HashMap<>();
        String s="aabbbbbbbbccyyddaa";
        int maxFreq=0;
        Character ans=0;

        for(int i=0;i<s.length();i++){
            char currentCharacter=s.charAt(i);
            if(countMapp.containsKey(currentCharacter)){
                int currentFreq=countMapp.get(currentCharacter);
                countMapp.put(currentCharacter,currentFreq+1);
            }
            else{
                countMapp.put(currentCharacter,1);
            }
            if(countMapp.get(currentCharacter)>maxFreq){
                maxFreq=countMapp.get(currentCharacter);
                ans=currentCharacter;
            }

        }
        System.out.println("The character having maximum freq is :- "+ ans +" with frequency "+ maxFreq);
    }
}
