package IndustryContent;
import java.util.Scanner;
public class Primee {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number upto which you want to check the list of prime numbers");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++) {
            boolean primeChk = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    primeChk=false;
                    break;
                }
            }
            if(primeChk)
            {
                System.out.println(i);
            }
        }

    }
}
