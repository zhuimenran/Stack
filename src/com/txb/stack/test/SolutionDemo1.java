package com.txb.stack.test;

import java.util.Stack;

/**
 * 括号是否合理
 * @author 13125
 *@version v1.0
 */
public class SolutionDemo1 {
	
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i ++) {
			char c = s.charAt(i);
			
			if(c == '{' || c == '[' || c == '(') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				
				char topChar = stack.pop();
				if(c==')' && topChar!='(') {
					return false;
				}
				
				if(c=='}' && topChar!='{') {
					return false;
				}
				
				if(c==']' && topChar!='[') {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
	

}
