/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    return fibo(n);
    
    function fibo(n){
        if(n == 0) return 0;
        if(n<=2) return 1;
        return fibo(n-1)+fibo(n-2);
    }
};