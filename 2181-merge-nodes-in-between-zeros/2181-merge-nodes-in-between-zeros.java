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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        ListNode mover = head.next;
        int sum = 0;
        while(mover!=null){
            if(mover.val!=0){
                sum+=mover.val;
            }else{
                ans.next = new ListNode(sum);
                ans = ans.next;
                sum = 0;
            }
            mover = mover.next;
        }
        return dummy.next;
    }
}