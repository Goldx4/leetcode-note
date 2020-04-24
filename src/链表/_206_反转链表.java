package 链表;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * @author Jin
 *
 */
public class _206_反转链表 { 
	
	/**
	 * 递归法
	 */
    public ListNode reverseList1(ListNode head) { 
    	if (head == null || head.next == null) return head;
    	
    	ListNode newHead = reverseList1(head.next);
    	head.next.next = head;
    	head = null;
    	
    	return newHead;
    }
	
	/**
	 * 迭代法
	 */
    public ListNode reverseList2(ListNode head) { 
    	ListNode newHead = null;
    	while (head != null) {  
    		ListNode temp = head.next;
    		head.next = newHead;
    		newHead = head;
    		head = temp;
    	}  
    	return newHead;
    }
}
