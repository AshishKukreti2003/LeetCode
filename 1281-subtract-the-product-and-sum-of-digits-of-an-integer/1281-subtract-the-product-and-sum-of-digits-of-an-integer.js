/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let pro = 1;
    let sum = 0;
    while(n!=0){
        const rem = n%10;
        sum+=rem;
        pro*=rem;
        n=Math.floor(n/10);
    }
    return pro-sum;
};