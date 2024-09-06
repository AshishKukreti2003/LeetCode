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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hash = new HashSet<>();
        for(int num:nums){
            hash.add(num);
        }
        
        ListNode main = new ListNode();
        ListNode temp = main;
        while(head!=null){
            if(!hash.contains(head.val)){
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }
        return main.next;
    }
}