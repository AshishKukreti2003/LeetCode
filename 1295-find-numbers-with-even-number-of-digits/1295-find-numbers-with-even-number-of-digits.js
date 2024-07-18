/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    let count = 0;
    for(let i=0;i<nums.length;i++){
        let op = 0;
        let num = nums[i];
        while(num!=0){
            op++;
            num = Math.floor(num/10);
        }
        if(op%2 == 0){
            count++;
        }
    }
    return count;
};