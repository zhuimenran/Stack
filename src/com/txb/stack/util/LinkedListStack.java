package com.txb.stack.util;

import com.txb.stack.test.SolutionDemo1;
import com.txb.stack.test.SolutionDemo2;

public class LinkedListStack<E> implements Stack<E> {

	private LinkedList<E> list;
	
	public LinkedListStack() {
		list = new LinkedList<E>();
	}
	@Override
	public int getSize() {
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		
		return list.isEmpty();
	}
/**
 * 在链表头添加元素
 */
	@Override
	public void push(E e) {
		list.addFirst(e);
	}

	/**
	 * 删除链表头
	 */
	@Override
	public E pop() {
		return list.removeFirst();
	}

	/**
	 * 链表头为栈顶元素
	 */
	@Override
	public E peek() {
		return list.getFirst();
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Stack:top");
		res.append(list);
		return res.toString();
	}
	
	public static void main(String[] args) {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		
		for(int i = 0 ; i < 5; i ++) {
			stack.push(i);
			System.out.println(stack);
		}
		
		stack.pop();
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
	}
}
