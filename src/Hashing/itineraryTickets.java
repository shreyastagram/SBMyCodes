package Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class itineraryTickets {
    public static void main(String[] args){
        HashMap<String,String> h=new HashMap<>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String source=sc.next();
            String destination=sc.next();
            h.put(source,destination);
            sc.nextLine();
        }

        Map<String,String> reverseTickets=new HashMap<>();
        for(Map.Entry<String,String> entry:h.entrySet()){
            reverseTickets.put(entry.getKey(),entry.getValue());

        }
        String startCity=null;
        for(String source:h.keySet()){
            if(!reverseTickets.containsKey(source)){
                startCity=source;
                break;
            }
        }
        if(startCity==null){
            System.out.println("Invalid");
            return;
        }
        String temp=startCity;
        while(temp!=null){
            System.out.println(temp+" ");
            temp=h.get(temp);
        }

    }
}
