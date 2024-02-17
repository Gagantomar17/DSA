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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2 ;
        ListNode head = new ListNode(100);
        ListNode ans = head ;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                ListNode temp = new ListNode(l1.val);
                ans.next = temp ;
                ans = ans.next;
                l1 = l1.next ;
            }else{
                ListNode temp = new ListNode(l2.val);
                ans.next = temp;
                ans = ans.next ;
                l2 = l2.next ;
            }
        }
        if(l1 == null){
            ans.next = l2;
        }else{
            ans.next = l1 ;
        }

        return head.next ;
    }
}