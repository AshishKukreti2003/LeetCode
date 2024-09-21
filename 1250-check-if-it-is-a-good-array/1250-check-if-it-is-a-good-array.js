/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isGoodArray = function(nums) {
    let gcd = nums[0];
    for(let num of nums){
        gcd = GCD(gcd,num);
        if(gcd === 1){
            return true;
        }
    }
    return false;
    
    function GCD(a,b){
        if(b === 0){
            return a;
        }
        else{
            return GCD(b,(a%b));
        }
    }
};