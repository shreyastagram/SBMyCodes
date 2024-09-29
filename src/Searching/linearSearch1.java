package Searching;

public class linearSearch1 {
    public static void main(String[]args){
        int[] arr1={23,45,21,55,234,1,34,90};
        int searchKey=34;
        System.out.println("The key "+searchKey+" found at index no :"+(linearSearch(arr1,searchKey)));
        int[] arr2={23,45,21,6,234,1,34,90};
        searchKey=420;
        System.out.println("The key "+searchKey+" found at index no :"+(linearSearch(arr2,searchKey)));
    }
    public static int linearSearch(int[] arr,int searchKey){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchKey){
                return i;
            }
        }
        return -1;
    }
}
