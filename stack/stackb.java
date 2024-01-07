package stack;
import java.util.*;
public class stackb {
    public static void main(String[] args) {
        Stack<Integer> Mystack = new Stack<>();
        Mystack.push(10);
        Mystack.push(20);
        int stackSum = Mystack.pop()+Mystack.pop();
        //System.out.println("the topmost element of the stack is:"+Mystack.pop());
        //System.out.println("the next topmost element of the stack is:"+Mystack.pop());
       System.out.println("the sum is:"+stackSum);

    }
}
