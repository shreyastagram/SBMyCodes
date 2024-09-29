package Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class matchLockAndKeys {
    public static void main(String[] args){
        HashMap<Character,Integer> h=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] locks=new char[n];
        char[] keys=new char[n];
        for(int i=0;i<n;i++){
            locks[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n;i++){
            keys[i]=sc.next().charAt(0);
            h.put(locks[i],i);
        }
        boolean possible=true;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++){
            char key=locks[i];
            if(h.containsKey(key)){
                result.append(key).append(" ").append(key).append('\n');
            }
            else{
                possible=false;
                break;
            }
        }
        if(possible){
            System.out.println(result.toString());
        }
        else{
            System.out.println("Not Possible");
        }
        sc.close();
    }
}
