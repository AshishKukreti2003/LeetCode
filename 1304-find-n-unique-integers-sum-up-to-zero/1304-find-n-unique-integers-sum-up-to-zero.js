/**
 * @param {number} n
 * @return {number[]}
 */
var sumZero = function(n) {
    let arr = [];
    let i=1;
    if(n%2 == 0){
        for(let j=0;j<n;j+=2){
            arr[j] = i;
            arr[j+1] = -i;
            i++;
        }
    }else{
        for(let j=0;j<n-1;j+=2){
            arr[j] = i;
            arr[j+1] = -i;
            i++;
        }
        arr[n-1] = 0;
    }
    return arr;
};