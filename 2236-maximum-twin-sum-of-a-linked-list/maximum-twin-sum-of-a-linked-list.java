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



    public int pairSum(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        ListNode l1 = reverse(slow.next);
        ListNode l2 = head ;
        int max = 0 ;
        while(l1 != null){
            int sum = l1.val + l2.val ;
            if(sum > max) max = sum ;
            l1 = l1.next ;
            l2 = l2.next ;
        }
        return max ; 
    }
}