/**
 * @param {number} n
 * @return {number}
 */
var pivotInteger = function(n) {
    for(let i=1;i<=n;i++){
        let startSum = 0, endSum = 0;
        for(let j=1;j<=i;j++){
            startSum+=j;
        }
        for(let j=i;j<=n;j++){
            endSum+=j;
        }
        if(startSum === endSum){
            return i;
        }
    }
    return -1;
};