package com.txb.stack.test;

import com.txb.stack.util.ArrayStack;

/**
 * 括号是否合理(使用自己设计的栈结构）
 * @author 13125
 *@version v1.1
 */
public class SolutionDemo2 {
	
	public boolean isValid(String s) {
		ArrayStack<Character> stack = new ArrayStack<>();
		
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
