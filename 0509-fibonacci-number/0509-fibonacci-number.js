/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    if(n == 0) return 0;
    let first = 0;
    let last = 1;
    for(let i=1;i<n;i++){
        let sum = first+last;
        first = last;
        last = sum;
    }
    return last;
};