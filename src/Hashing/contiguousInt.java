package Hashing;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class contiguousInt {
    public static void main(String[] args){
        HashSet<Integer> h=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n<1) {
            System.out.println("Set is Empty");
            return;
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            h.add(arr[i]);
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int num:h){
            if(num < min) min=num;
            if(num > max) max=num;
        }
        if(max-min+1==h.size()){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }
    }
}
