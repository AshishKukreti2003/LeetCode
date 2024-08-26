/**
 * @param {number} num
 * @return {number}
 */
var addDigits = function(num) {
    if(num<10) return num;
    return 1+(num-1)%9;
};