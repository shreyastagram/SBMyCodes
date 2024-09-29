package Algorithms;
import java.util.Scanner;
public class algorithm2 {
    public static void main(String []args){
        System.out.println("enter the fibonacci number to be generated....");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        algorithm2 fibo2= new algorithm2();
        fibo2.fib(n);
    }
    public void fib(int n){
        int[] f=new int[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=(f[i-1]+f[i-2])%10;
        }
        System.out.println("Fibonacci Number:- "+f[n]);
    }
}
