package DataStructures.Stacks;

import java.util.Stack;

public class Expression {
    private String input;

    public Expression(String input) {
        this.input = input;
    }
    public boolean isBalanced(){
        Stack<Character>  st = new Stack<>();
        for (char ch : input.toCharArray()){
            if (ch == '(')
                st.push(ch);
            if (ch == ')')
                if (st.empty()) return false;
                st.pop();
        }
        return st.empty();
    }
}
