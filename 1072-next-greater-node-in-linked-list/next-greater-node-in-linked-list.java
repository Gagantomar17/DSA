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
    public int[] nextLargerNodes(ListNode head) {
        int n = 0 ;
        ListNode temp = head ;
        while(temp!= null){
            n++ ;
            temp = temp.next ;
        }
        int[] array = new int[n];
        temp = head ;
        n=0 ;
        while(temp != null ){
            boolean found = false ;
            ListNode temp2 = temp.next ;
            while(temp2 != null ){
                if(temp2.val > temp.val){
                    array[n++] = temp2.val ;
                    found = true ;
                    break ;
                }
                temp2 = temp2.next ;
            }
            if(!found){
                array[n++] = 0 ;
            }
            temp = temp.next ;
        }
        return array ;
    }
}