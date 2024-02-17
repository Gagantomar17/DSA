class Solution {

    public ListNode reverse(ListNode head){
        ListNode curr = head ;
        ListNode prev = null ;
        ListNode agla = null ;
        while(curr != null){
            agla = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = agla ;

        }
        return prev ;
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