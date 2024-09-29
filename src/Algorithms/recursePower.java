package Algorithms;
import java.util.Scanner;

public class recursePower {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        recursePower raised=new recursePower();
        int result=recursePower.raised(n,p);
        System.out.println(result);
    }
    public static int raised(int n,int p) {
        int a=1;
        for(int i=1;i<=p;i++){
            a=a*n;
        }
        return a;
    }
}
