package DSA_practice;

import java.util.Stack;

public class spra {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
          // Check stack is empty or not 
          System.out.println(stack.empty()); 
        //   to push 
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        System.out.println(stack.empty());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek()); 
        System.out.println(stack.search("4"));
          
    }
}
