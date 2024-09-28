/**
 * @param {string} s
 * @return {boolean}
 */
var validPalindrome = function(s) {
    let left = 0, right = s.length-1;
    while(left<=right){
        if(s.charAt(left) != s.charAt(right)){
            return palindrome(s,left+1,right) || palindrome(s,left,right-1);
        }
        left++;
        right--;
    }
    return true;
    
    function palindrome(s,left,right){
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
};