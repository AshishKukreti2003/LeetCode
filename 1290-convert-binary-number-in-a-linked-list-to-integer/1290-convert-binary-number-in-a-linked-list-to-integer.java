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
    public int getDecimalValue(ListNode head) {
        int num = 0;
        int size = 0;
        ListNode mover = head;
        while(mover!=null){
            size++;
            mover = mover.next;
        }
        
        ListNode temp = head;
        for(int i=size-1;i>=0;i--){
            num+=(temp.val)*(int)Math.pow(2,i);
            temp = temp.next;
        }
        return num;
    }
}