package Hashing;
import java.util.HashSet;
import java.util.Scanner;
public class hashSetQ {
    public static void main(String[] args){
        HashSet<Integer> h=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            switch (a) {
                case 1 -> h.add(b);
                case 2 -> System.out.println(h.contains(b));
                case 3 -> h.remove(b);
                default -> System.out.println("Invalid Operation");
            }
        }

    }
}
