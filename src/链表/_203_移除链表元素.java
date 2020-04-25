package 链表;
 
// https://leetcode-cn.com/problems/remove-linked-list-elements/  

public class _203_移除链表元素 {
	/** 思想：哨兵节点 */  
	
	// 自己没做出来 
    public ListNode removeElements(ListNode head, int val) {
    	ListNode sentinel = new ListNode(0);
    	sentinel.next = head;
    	ListNode prev = sentinel;
    	ListNode curr = head;
    	while (curr != null) {
			if (curr.val == val) {
				prev.next = curr.next;
			} else {
				prev = prev.next;
			}
			curr = curr.next;
		} 
    	return sentinel.next;
    }

}
