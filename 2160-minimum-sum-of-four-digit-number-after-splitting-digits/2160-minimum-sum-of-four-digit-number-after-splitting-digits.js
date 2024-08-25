/**
 * @param {number} num
 * @return {number}
 */
var minimumSum = function(num) {
    let arr = [];
    while(num!=0){
        let rem = num%10;
        arr.push(rem);
        num = Math.floor(num/10);
    }
    arr.sort();
    return (arr[2]+arr[0]*10)+(arr[3]+arr[1]*10);
};