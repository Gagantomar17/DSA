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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode temp = head ;
        ListNode current = head ;
        ListNode prev = null;
        int size = 0;
        int i = 0;
        while(temp != null){
            size ++;
            temp = temp.next;
        }
        int mid_node = size / 2;
        while(i != mid_node){
            prev = current ;
            current = current.next;
            i++;
        }
        
        prev.next = current.next;
        return head ;
    }
}