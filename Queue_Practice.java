
public class Queue_Practice {
	//Queue data structure
	//implement queue using array
	//this class implement stack using array, can also implement using linked list
	//这个类以及文件夹都是为刷题准备， 数组均为整数数组, 数组长度足够大并且固定
	//enqueue() dequeue() first() tail () size() isEmpty() isFull()
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
	
	//use circular array to implement queue
	//LC 622 test 
	//https://leetcode.com/problems/design-circular-queue/
	public static class Queue_CirArr {
		public int[] queue;
		public int l;
		public int r;
		public int size;
		public int limit;
		//constructor
		public Queue_CirArr(int capacity) {
			queue = new int[capacity];
			l = 0;
			r = 0;
			size = 0;
			limit = capacity;
		}
		
		//methods
		public void enqueue(int data) {
			if(!isFull()) {
				queue[r] = data;
				r = r == limit-1? 0:(r+1);
				size++;
			}
		}
		//dequeue method need exception check on whether array is empty or full
		//we use false and true ad the return value type instead of int
		public boolean dequeue() {
			if (isEmpty()) {
				return false;
			}else {
				l = l == limit? 0: (l+1);
				size--;
				return true;
			}
			
		}
		//empty array. return -1
		public int first() {
			if (isEmpty()) {
				return -1;
			}else {
				return queue[l];
			}
			
		}
		public int rear() {
			if (isEmpty()) {
				return -1;
			}else {
				int last = r==0? (limit-1): (r-1);
				return queue[last];
			}
		}
		public int size() {
			return size;
		}
		public boolean isEmpty() {
			return size == 0;
		}
		public boolean isFull() {
			return size == limit;
		}
	}
	
	//LC232 Implement queue using stack
	//https://leetcode.com/problems/implement-queue-using-stacks/description/
}
