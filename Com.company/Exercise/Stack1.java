import java.io.*;
import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("manisha");
        stack.push("Sumanth");
        stack.push("Swetha");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
