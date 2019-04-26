package com.txb.stack.util;

/**
 * 栈接口
 * @author 13125
 *
 */
public interface Stack<E> {
	//得到数量
	public int getSize();
	
	//判断是否为空
	public boolean isEmpty();
	
	//入栈
	public void push(E e);
	
	//出栈
	public E pop();
	
	//查看栈顶的元素
	public E peek();
}
