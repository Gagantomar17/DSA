class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null ;
        }
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            if(fast == null || fast.next==null){
                slow.next = slow.next.next ;
                return head ;
            }
            slow = slow.next ;
        }
        return head ;
    }
}