package DynamicProgramming;
import java.util.Scanner;
import java.util.*;
public class TwoDimensionalArrayy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n=sc.nextInt();//Taking the input of rows
        System.out.println("Enter the number of columns :");
        int m=sc.nextInt();//Taking the input of columns
        int[][] arr=new int[n][m];
        System.out.println("Enter the elements of array : ");

        //Using nested loops to fill the 2D Array
        //rows
        for(int i=0;i<n;i++){
            //columns
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Taking the input of the element to find in the 2D array
        System.out.println("Enter the target Element");
        int target=sc.nextInt();
        //using nested loops to print the 2d array
        //rows
        for(int i=0;i<n;i++){
            //columns
            for(int j=0;j<m;j++){
                //find the target elements indices
                if(arr[i][j]==target){
                    System.out.println("Target is found at index : ("+i+","+j+")");
                    break;
                }
            }
        }
        System.out.println("Target not found!");
        //Alternate way to print 2D Arrays
//        System.out.println("Using deepToString to print the 2D Array : ");
//        System.out.println(Arrays.deepToString(arr));
        sc.close();
    }
}
