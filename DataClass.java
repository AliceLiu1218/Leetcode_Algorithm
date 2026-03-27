

public class DataClass {
	
	//Singly Linear Node， Linear Node
	public static class ListNode<T> {
		public T value;
		public ListNode<T> nextNode;
		
		//constructor
		public ListNode() {
			this.value = null;
			this.nextNode = null;
		}
		
		public ListNode(T value) {
			this.value = value;
			this.nextNode = null;
		}
		
		public ListNode(T value, ListNode<T> next) {
			this.value = value;
			this.nextNode = next;
		}
	}
	
	//stack class
	public static class Stack {
		
	}
	
	//Queue class
	public static class Queue {
		
	}
}
