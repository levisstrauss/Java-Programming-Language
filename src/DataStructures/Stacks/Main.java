package DataStructures.Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);

        // Expression balanced
        String str = "(1 + 2)";
        Expression exp = new Expression(str);
        System.out.println(exp.isBalanced());

    }
}
