/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let a = s.split(" ");
    for(let i = 0;i<a.length;i++){
        a[i] = reverse(a[i]);
    }
    return a.join(" ");
    
    function reverse(a){
        return a.split('').reverse().join('');
    }
};