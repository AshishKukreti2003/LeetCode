/**
 * @param {number} n
 * @return {number}
 */
var smallestEvenMultiple = function(n) {
    for(let i=1;i<=2*n;i++){
        if(i%2 == 0 && i%n == 0){
            return i;
            break;
        }
    }
    return -1;
};