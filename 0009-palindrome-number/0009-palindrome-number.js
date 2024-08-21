/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let n = x, sum = 0, rem = 0;
    while(n>0){
        rem = n%10;
        sum = sum*10 + rem;
        n = Math.floor(n/10);
    }
    return sum == x;
};