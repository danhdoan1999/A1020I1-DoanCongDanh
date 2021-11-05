package bai11_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        int[] arr = {3,6,5,7,9};
        for (int i = 0 ; i < arr.length ; i++ ){
            myStack.push(arr[i]);
        }
        int[] reverseArr = new int[arr.length];
        for (int i = 0 ; i < arr.length; i++){
            reverseArr[i] = myStack.pop();
        }
        System.out.println(Arrays.toString(reverseArr));
    }
}
