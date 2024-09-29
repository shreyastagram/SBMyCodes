package STACK;

import java.util.Scanner;

public class parensMatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String parens=sc.nextLine();
        try {
            System.out.println(parensCheck(parens));
        }
        catch(Exception e){
            System.out.println("Error in String");

        }
    }
    public static boolean parensCheck(String parens)throws Exception{
        int count =0;
        char[] chars=parens.toCharArray();

        for(char c:chars){
            if(c=='('){
                count++;
            }
            else if(c==')'){
                if(count>0){
                    count--;
                }
                else{
                    return false;
                }
            }
            else{
                throw new Exception("Invalid Charecter");
            }
        }
        if(count==0){
            return true;
        }
        else{
            return false;
        }


    }

}
