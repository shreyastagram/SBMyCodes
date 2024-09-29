package STACK;
import java.util.*;
public class kElement {
    public static void main(String[] args){
        Stack<Integer> inputStack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            inputStack.push(sc.nextInt());
        }
        if(inputStack.isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(0);
        }
        int k=sc.nextInt();
        if(k>inputStack.size()){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        findKElement(inputStack,k);
    }
    public static void findKElement(Stack<Integer> sortStack,int k){
        int count=0;
        int result=-1;
        while(!sortStack.isEmpty()) {
            count++;
            int value = sortStack.pop();
            if (count == k) {
                result = value;
                break;
            }
        }
        System.out.println(result);


    }
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack=new Stack<>();
        while(!input.isEmpty()){
            int value=input.pop();
            while(!tempStack.isEmpty()&&value<tempStack.peek()){
                input.push(tempStack.pop());
            }
            tempStack.push(value);
        }
        return tempStack;
    }
}
