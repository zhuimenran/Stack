package com.txb.stack.util;
/**
 * 用数组实现stack
 * @author 13125
 *
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {

	Array<E> array;
	
	public ArrayStack(int capacity) {
		array = new Array<>(capacity);
	}
	
	public ArrayStack() {
		array = new Array<>(10);
	}
	
	
	@Override
	public int getSize() {
		return array.getSize();
	}
	
	public int getCapacity() {
		return array.getCapacity();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}
/**
 * 入栈，在数组最后添加元素
 */
	@Override
	public void push(E e) {
		array.addLast(e);
	}
/***
 * 出栈，移出数组的最后一个元素
 */
	@Override
	public E pop() {
		return array.removeLast();
	}

	/**
	 * 查看栈顶元素
	 */
	@Override
	public E peek() {
		return array.getLast();
	}
	
	//to String
		@Override
		public String toString() {
			StringBuilder res = new StringBuilder();
			res.append(String.format("Stack: size = %d , capacity = %d\n",  array.getSize() , array.getCapacity()));
			res.append("[");
			
			for(int i = 0; i < array.getSize(); i ++) {
				res.append(array.get(i));
				if(i != array.getSize()-1) {
					res.append(",");
				}
			}
			
			res.append("]top");
			
			return res.toString();
		}

}
