/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {number} m
 * @param {number} n
 * @param {ListNode} head
 * @return {number[][]}
 */
var spiralMatrix = function(m, n, head) {
    let matrix = new Array(m).fill(-1).map(() => new Array(n).fill(-1));
    let top = 0, bottom = m-1, left = 0, right = n-1;
    while(head!= null){
        for(let i=left;i<=right && head!=null ;i++){
            matrix[top][i] = head.val;
            head = head.next;
        }
        top++;
        for(let i=top;i<=bottom && head!= null;i++){
            matrix[i][right] = head.val;
            head = head.next;
        }
        right--;
        for(let i=right;i>=left && head!=null;i--){
            matrix[bottom][i] = head.val;
            head = head.next;
        }
        bottom--;
        for(let i=bottom;i>=top && head!=null;i--){
            matrix[i][left] = head.val;
            head = head.next;
        }
        left++;
    }
    return matrix;
};