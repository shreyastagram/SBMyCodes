package Queues;
import java.util.*;
public class Binary {
    public static void main(String[] args){
        Binary obj=new Binary();
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine();
        String s=sc.nextLine();
        int result=Integer.parseInt(f)+Integer.parseInt(s);
        obj.generateBinary(result);
    }
    static void generateBinary(int result) {
        Queue<Integer> q1 = new LinkedList<>();
        int temp = result;
        while (temp > 0) {
            q1.add(temp % 2);
            temp = temp / 2;
        }
        StringBuilder finale=new StringBuilder();
        while (!q1.isEmpty()) {
            finale.append(q1.remove());
        }
        System.out.println(finale.reverse());
    }

}
