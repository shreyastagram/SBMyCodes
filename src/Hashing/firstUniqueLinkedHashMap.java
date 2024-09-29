package Hashing;
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class firstUniqueLinkedHashMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> h=new LinkedHashMap<>();
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!h.containsKey(ch)){
                h.put(ch,1);
            }
            else{
                h.put(ch,h.get(ch)+1);
            }
        }
        char firstUniqueChar='\0';
        for(Character ch:h.keySet() ){
            if(h.get(ch)==1) {
                firstUniqueChar=ch;
                break;
            }

        }
        if(firstUniqueChar!='\0'){
            System.out.println(firstUniqueChar);

        }
        else{
            System.out.println("-1");
        }
    }

}
