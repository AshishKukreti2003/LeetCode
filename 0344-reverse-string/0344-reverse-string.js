/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function(s) {
    let start = 0;
    let end = s.length-1;
    while(start<=end){
        swap(s,start,end);
        start++;
        end--;
    }
    function swap(s,i,j){
        let temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
};