class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null ){
            fast = fast.next.next ;
            // if(fast == null){
            //     return slow.next ;
            // }
            slow = slow.next ;
        }
        return slow ;
        
    }
}