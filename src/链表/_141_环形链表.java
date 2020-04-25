package 链表;

public class _141_环形链表 { 
	/** 思想：快慢指针 */  
	
	/** 我的实现 */
	// 分析：
	// 1.缺少临界值判断
	// 2.直接return即可 用break太垃圾了
	// 3.while (fast.next != null) 缺少判断fast != null
    public boolean hasCycle(ListNode head) { 
    	ListNode slow = head;
    	ListNode fast = head.next;
    	Boolean flag = false;
    	while (fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		if (slow == fast) {
				flag = true;
                break;
			}
		}
    	return flag;
    }
	 
	/** 标准答案 */
    public boolean hasCycle1(ListNode head) { 
    	if (head == null || head.next == null) return false;
    	ListNode slow = head;
    	ListNode fast = head.next; 
    	while (fast != null && fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		if (slow == fast) return true; 
		}
    	return false;
    }
}
