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
        ListNode ans = new ListNode();
        ListNode mover = ans;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                mover.next = list1;
                list1 = list1.next;
            }else{
                mover.next = list2;
                list2 = list2.next;
            }
            mover = mover.next;
        }
        mover.next = (list1!=null) ? list1:list2;
        return ans.next;
    }
}