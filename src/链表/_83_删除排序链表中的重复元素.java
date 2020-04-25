package 链表;

public class _83_删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) { 
        if (head == null) return head;
    	ListNode prev = head;
    	ListNode curr = head.next;
    	while (curr != null) {
			if (prev.val == curr.val) {
				prev.next = curr.next;
			} else {
				prev = curr;
			}
			curr = curr.next;
		}
    	return head;
    }
 
}
