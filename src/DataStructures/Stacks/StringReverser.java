package DataStructures.Stacks;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if(input == null)
            throw new IllegalArgumentException();
        Stack<Character> st = new Stack<>();
        //for(int i = 0; i < input.length(); i++){
        //    st.push(input.charAt(i));
        //}
        for(char ch : input.toCharArray())
            st.push(ch);
         StringBuffer reversed = new StringBuffer();
         while(!st.empty())
             reversed.append(st.pop());
         return reversed.toString();
    }
}
