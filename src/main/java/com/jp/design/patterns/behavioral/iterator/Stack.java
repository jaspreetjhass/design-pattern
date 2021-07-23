package com.jp.design.patterns.behavioral.iterator;

public class Stack implements MyCollection {

	private int top;
	private int size;
	private int[] arr;

	Stack() {
		arr = new int[10];
		top = -1;
	}

	public void push(int data) {
		top++;
		arr[top] = data;
		size++;
	}

	public int pop() {
		int res = -1;
		if (isEmpty())
			return res;
		res = arr[top];
		top--;
		size--;
		return res;
	}

	public int peek() {
		int res = -1;
		if (isEmpty())
			return res;
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return this.size;
	}

	@Override
	public Iterator iterator() {
		return new Itr();
	}

	private class Itr implements Iterator {

		private int index = 0;

		@Override
		public boolean hasNext() {
			if (index < size)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if (hasNext())
				return arr[index++];
			return null;
		}

	}

}

class StackExe {
	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		Iterator iterator = stack.iterator();

		while (iterator.hasNext()) {
			System.out.println(stack.pop());
		}

	}
}
