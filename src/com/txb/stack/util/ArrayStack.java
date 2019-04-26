package com.txb.stack.util;

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

	@Override
	public void push(E e) {
		array.addLast(e);
	}

	@Override
	public E pop() {
		return array.removeLast();
	}

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
