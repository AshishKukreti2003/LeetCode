/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length == 0) return null;
        ListNode f = head;
        ListNode s = head;
        while(length > 0){
            s = s.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
    
    static int lengthCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
            int length = 0;
            if(slow == fast){
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
}