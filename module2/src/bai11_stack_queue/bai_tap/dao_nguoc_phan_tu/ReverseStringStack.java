package bai11_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        Stack<Character> wStack = new Stack<>();
        String string = "hello";
        char[] mWord =  string.toCharArray();

        for (int i = 0 ; i< string.length();i++){
            wStack.push(mWord[i]);
        }
        int index = 0;
        while (!wStack.isEmpty()){
            mWord[index++] = wStack.pop();
        }
        System.out.println(string.copyValueOf(mWord));
    }
}
