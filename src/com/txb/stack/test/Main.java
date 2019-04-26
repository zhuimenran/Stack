package com.txb.stack.test;

import java.util.Random;

import com.txb.stack.util.ArrayStack;
import com.txb.stack.util.LinkedListStack;
import com.txb.stack.util.Stack;

public class Main {
/*
	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>(5);
		
		for(int i = 0 ; i < 5; i ++) {
			stack.push(i);
			System.out.println(stack);
		}
		
		stack.pop();
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		//String s = "(hjg(bjh0)khj{jhj(kji)})";
		//注意字符串的格式，以及是否有空格
		String s = "(){{)}}";
		SolutionDemo1 solution1 = new SolutionDemo1();
		
		boolean bool1 = solution1.isValid(s);
		System.out.println(bool1);
		
         SolutionDemo2 solution2 = new SolutionDemo2();
		
		boolean bool2 = solution2.isValid(s);
		System.out.println(bool2);
	}*/
public static double testQueue(Stack<Integer> q, int opCount) {
		
		long startTime = System.nanoTime();
		
		Random random = new Random();
		
		for(int i = 0; i < opCount; i++) {
			q.push(random.nextInt(Integer.MAX_VALUE));
		}
		
		for(int i = 0; i < opCount; i ++) {
			q.pop();
		}
		long endTime = System.nanoTime();
		
		return (endTime-startTime)/1000000000.0;
		
	}

	public static void main(String[] args) {
		
		int opCount = 10000;
		
		ArrayStack<Integer> array = new ArrayStack<>();
		double time1 = testQueue(array,opCount);
		System.out.println(time1);
		
		LinkedListStack<Integer> loop = new LinkedListStack<>();
		double time2 = testQueue(loop,opCount);
		System.out.println(time2);
		
	}

}
