/**
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
var addToArrayForm = function(num, k) {
    let arr = [];
    let i = num.length-1;
    while(i>=0 || k>0){
        if(i>=0){
            k+=num[i];
        }
        arr.push(k%10);
        k = Math.floor(k/10);
        i--;
    }
    arr.reverse();
    return arr;
};