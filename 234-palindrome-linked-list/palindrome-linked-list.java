class Solution {

    public ListNode reverse(ListNode head){
        if(head.next == null) return head ;
        ListNode newHead = reverse(head.next);
        head.next.next = head ;
        head.next = null ;
        return newHead ;
    }



    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true ;
        }
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null ){
            fast = fast.next.next ;
            if(fast == null) break ;
            slow=slow.next ;
        }

        ListNode l1 = reverse(slow.next);
        ListNode l2 = head ;

        while(l1 != null){
            if(l2.val != l1.val){
                return false ;
            }
            l1 = l1.next ;
            l2 = l2.next ;
        }
        return true ;
    }
}