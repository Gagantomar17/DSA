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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode temp = head ;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        ListNode current = head ;
        ListNode prev = null;
        int start = 1;
        int last = size+1-n ;
        while(start != last){
            start++;
            prev = current;
            current = current.next;
        }
        if(prev == null){
            head = head.next;
        }else if(current.next == null){
            prev.next = null;
        }else{
            prev.next = current.next ;
        }
        
        return head ;

    }
}