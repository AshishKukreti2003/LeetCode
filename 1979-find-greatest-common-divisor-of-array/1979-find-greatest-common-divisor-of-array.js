/**
 * @param {number[]} nums
 * @return {number}
 */
var findGCD = function(nums) {
    nums.sort((a,b) => a-b);
    let min = nums[0], max = nums[nums.length-1];
    return gcd(min,max);
    
    function gcd(a,b){
        while(b!=0){
            let temp = b;
            b=a%b;
            a = temp;
        }
        return a;
    }
};