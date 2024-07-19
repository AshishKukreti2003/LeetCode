/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;
    let i=0;
    while(i<n){
        let correct = nums[i];
        if(nums[i] < n && nums[i] != nums[correct]){
            swap(nums,i,correct);
        }else{
            i++;
        }
    }
    for(let i=0;i<n;i++){
        if(nums[i] != i){
            return i;
        }
    }
    return nums[n-1]+1;
    
    function swap(array,i,j){
        let temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    };
};