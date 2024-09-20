/**
 * @param {string} s
 * @return {string}
 */
var shortestPalindrome = function(s) {
    let reversed = s.split('').reverse().join('');
    let n = s.length;
    for(let i=0;i<n;i++){
        if(s.substring(0,n-i) === reversed.substring(i)){
            return reversed.substring(0,i)+s;
        }
    }
    return s;
    
};