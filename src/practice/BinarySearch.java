package practice;

public class BinarySearch {
    public static void main(String[] args){

        int arr[]={1,2,3,4,55,66,78};
        int target=78;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] array,int target,int s,int e){
        if(s > e){
            return -1;
        }
        int m=s+ (e-s)/2;

        if(array[m]==target){
            return m;
        }
        if(target<array[m]) {
            return search(array, target, s, m - 1);
        }
            return search(array,target,m+1,e);
    }
}
