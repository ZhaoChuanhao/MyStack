package com.hd.dto;

import javax.xml.stream.events.Characters;
import java.util.Stack;

/**
 * @author chuanhao.zhao@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2018/10/18
 */
public class Main {

    public static void main(String[] args){
        MyStack<String> stack = new MyArrayStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }

}

// 括号匹配
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (top == '(' && c != ')'){
                    return false;
                }
                if (top == '[' && c != ']'){
                    return false;
                }
                if (top == '{' && c != '}'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
