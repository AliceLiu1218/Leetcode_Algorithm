

public class LinkedList_Practice {
	public static class ListNode {
		public int val;
		public ListNode next;
		
		//constructor
		public ListNode() {
			this.val = null;
			this.next = null;
		}
		
		public ListNode(int value) {
			this.val = value;
			this.next = null;
		}
		
		public ListNode(int value, ListNode next) {
			this.val = value;
			this.next = next;
		}
	}

	//LC 206 Reverse Singly Linked List
	//https://leetcode.com/problems/reverse-linked-list/description/?envType=problem-list-v2&envId=linked-list
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode curr = head;
        ListNode pre = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        head = pre;
        return head;
    }
	
	//LC 21 Merge two ordered Linked List
	//https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=problem-list-v2&envId=linked-list
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        if(list1 == null && list2 == null){
            return null;
        }
        if (list1 == null && list2 != null){
            return list2;
        }
        if (list2 == null && list1 != null){
            return list1;
        }
        ListNode curr = list1;
        ListNode next1 = null;
        ListNode next2 = null;
        if(list1.val <= list2.val){
            head = list1;
            curr = head;
            next1 = list2;
            next2 = curr.next;
        }else{
            head = list2;
            curr = head;
            next1 = list1;
            next2 = curr.next;
        }
        
        while(curr != null){
            if (next1 == null && next2 != null){
                curr.next = next2;
                return head;
            }
            if (next2 == null && next1 != null){
                curr.next = next1;
                return head;
            }
            if(next1.val <= next2.val){
                curr.next = next1;
                curr = next1;
                next1 = next1.next;
            }else{
                curr.next = next2;
                curr = next2;
                next2 = next2.next;
            }
        }
        return null;
    }
	
	//LC2 Add two Linked List
	//https://leetcode.com/problems/add-two-numbers/?envType=problem-list-v2&envId=linked-list
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //no empty linked list
        //all number are not negative
        
        ListNode head = null;
        ListNode pre = null;
        ListNode result = null;
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        int val = 0;
        int carry = 0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        while(curr1 != null || curr2 != null){
            num1 = curr1 == null? 0:curr1.val;
            num2 = curr2 == null? 0:curr2.val;
            num = num1 + num2 + carry;
            val = num % 10;
            carry = num / 10;
            result = new ListNode(val);
            if (head == null){
                head = result;
                pre = result;
                
            }else{
                pre.next = result;
                pre = pre.next;
            }
           
            curr1 = curr1 == null? curr1:curr1.next;
            curr2 = curr2 == null? curr2:curr2.next;
        }
        if (carry == 1){
           result = new ListNode(carry);
           pre.next = result; 
        }

        return head;
    }
	
	//LC86 Partition Linked List


}
