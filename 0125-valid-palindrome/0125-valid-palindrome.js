/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let output = s.toLowerCase();
    let ans = output.replace(/[^a-z0-9]/g,'');
    let start = 0, end = ans.length-1;
    while(start<=end){
        if(ans.charAt(start) !== ans.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
};