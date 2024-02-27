/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1 ;
        ListNode t2 = l2 ;
        ListNode ans = new ListNode(0);
        ListNode t3 = ans ;
        int carry = 0;
        while(t1 != null || t2 != null || carry != 0){
            int digit1 = (t1 != null)? t1.val : 0 ;
            int digit2 = (t2 != null)? t2.val : 0 ;
            int num = digit1 + digit2 + carry  ;
            int digit = num % 10 ;
            ListNode n = new ListNode(digit);
            t3.next = n ;
            t3 = t3.next ;
            carry = num / 10 ;
            t1 = (t1 != null) ? t1.next : null ;
            t2 = (t2 != null) ? t2.next : null ;
        }
        ans = ans.next  ;
        return ans ;
    }
}