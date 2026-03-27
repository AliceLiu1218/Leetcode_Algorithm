
public class Stack_Practice {
	//stack data structure
	//this class implement stack using array, can also implement using linked list
	//这个类以及文件夹都是为刷题准备， 数组均为整数数组,数组长度固定
	//push() pop() peek() isEmpty() size()
	public static class Stack {
		public int[] stack;
		public int size;
		
		//constructor
		public Stack(int capacity) {
			stack = new int[capacity];
			size = 0;
		}
		
		//methods
		public void push(int data) {
			stack[size++] = data;
		}
		public int pop() {
			return stack[--size];
		}
		public int peek() {
			return stack[size -1];
		}
		public boolean isEmpty() {
			return size == 0;
		}
		public int size() {
			return size;
		}
	}
	
	//LC 225 Implement stack using queue
	//https://leetcode.com/problems/implement-stack-using-queues/
	
	//LC155 Min Stack
	//https://leetcode.com/problems/min-stack/
}
