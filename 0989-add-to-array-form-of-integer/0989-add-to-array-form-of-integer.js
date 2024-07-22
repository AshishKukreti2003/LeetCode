/**
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
var addToArrayForm = function(num, k) {
    let arr = [];
    let i = num.length-1;
    while(i>= 0 || k> 0){
        if(i>=0){
            arr.push((num[i]+k)%10);
            k = Math.floor((num[i]+k)/10);
        }else{
            arr.push(k%10);
            k = Math.floor(k/10);
        }
        i--;
    }
    arr.reverse();
    return arr;
};