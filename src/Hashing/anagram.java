package Hashing;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        HashMap<String, String> mapp = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            String value = sc.next();
            mapp.put(key,value);
        }
        boolean foundAnagram=false;

        List<String> keys=new ArrayList<>(mapp.keySet());
        Collections.sort(keys);

        for(String key:keys){
            String value=mapp.get(key);
            if(check(key,value)){
                System.out.println(key + " "+ value);
                foundAnagram=true;
            }
            if(!foundAnagram){
                System.out.println("false");

            }
            sc.close();
        }
    }
    public static boolean check(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }
}
