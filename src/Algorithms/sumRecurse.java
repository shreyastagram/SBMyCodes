package Algorithms;
import java.util.Scanner;

public class sumRecurse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumRecurse sum = new sumRecurse();
        if(n>0){
            int value=sumRecurse.sum(n);
            System.out.println(value);
        }
        else{
            System.out.println("Enter a natural number");
        }
    }
    public static int sum(int n){
        int num=0;
        for(int i=0;i<=n;i++){
            num=i+num;
        }
        return num;

    }
}


