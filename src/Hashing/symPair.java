package Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class symPair {
    public static void main(String[] args){
        HashMap<Integer,Integer> mapp=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int[][] arr=new int[r][2];
        for(int i=0;i<r;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            int first1=arr[i][0];
            int second1=arr[i][1];
            Integer data=mapp.get(second1);
            if(data!=null && data==first1){
                System.out.println(second1+" "+first1);
                flag=true;
            }
            else{
                mapp.put(first1,second1);
            }


        }
        if(!flag){
            System.out.println("No Symmetric Pair");
        }

    }
}
