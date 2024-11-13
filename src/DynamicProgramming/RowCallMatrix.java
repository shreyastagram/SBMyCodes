package DynamicProgramming;
import java.util.*;
public class RowCallMatrix {
    //this question is based on a row wise and column wise sorted matrix
    public static void main(String[] args){
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
         System.out.println(Arrays.toString(search(arr,49 )));

    }
    static int[] search(int[][] matrix,int target){
         int r=0;//Setting the lower bound
         int c=matrix.length - 1;//Setting the upper bound

         while(r < matrix.length && c >= 0){
             //if the target is present at current index value return index
             if(matrix[r][c]==target){
                 return new int[]{r,c};
             }
             //if the target is greater than the current index value find in the next wow
             if(matrix[r][c]<target){
                 r++;
             }else{//if the target is lesser than the current index value search in the previous column
                 c--;
             }
         }
         return new int[]{-1,-1};
    }
}
