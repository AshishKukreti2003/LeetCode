/**
 * @param {number} n
 * @param {number} k
 * @return {number}
 */
var kthFactor = function(n, k) {
    let arr = [];
    for(let i=1;i<=n;i++){
        if(n%i == 0){
            arr.push(i);
        }
    }
    if(arr.length < k){
        return -1;
    }
    return arr[k-1];
};