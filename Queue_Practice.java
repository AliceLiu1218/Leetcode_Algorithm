
public class Queue_Practice {
	//Queue data structure
	//implement queue using array
	//this class implement stack using array, can also implement using linked list
	//这个类以及文件夹都是为刷题准备， 数组均为整数数组, 数组长度足够大并且固定
	//enqueue() dequeue() first() tail () size() isEmpty()
	public static class Queue {
		public int[] queue;
		public int l;
		public int r;
		//constructor
		public Queue(int capacity) {
			queue = new int[capacity];
			l = 0;
			r = 0;
		}
		
		//methods
		public void enqueue(int data) {
			queue[r] = data;
			r++;
		}
		public int dequeue() {
			int res = queue[l];
			l++;
			return res;
		}
		public int first() {
			return queue[l];
		}
		public int tail() {
			return queue[r-1];
		}
		public int size() {
			return r - l;
		}
		public boolean isEmpty() {
			return l == r;
		}
	}
	
	//LC232 Implement queue using stack
	//https://leetcode.com/problems/implement-queue-using-stacks/description/
}
