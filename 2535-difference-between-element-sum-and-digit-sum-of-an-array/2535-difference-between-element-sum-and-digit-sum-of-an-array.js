/**
 * @param {number[]} nums
 * @return {number}
 */
var differenceOfSum = function(nums) {
    let elementSum = 0, digitSum = 0;
    for(let i=0;i<nums.length;i++){
        elementSum+=nums[i];
        if(nums[i] >= 10){
            while(nums[i]!=0){
                let rem = nums[i]%10;
                digitSum+=rem;
                nums[i] = Math.floor(nums[i]/10);
            }
        }else{
            digitSum+=nums[i];
        }
    }
    return Math.abs(elementSum-digitSum);
};