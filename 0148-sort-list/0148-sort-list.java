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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }
    
    public ListNode merge(ListNode left, ListNode right){
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(left!=null && right!=null){
            if(left.val < right.val){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        temp.next = (left!=null) ? left : right;
        return ans.next;
    }
    
    public ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head!=null && head.next!=null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}