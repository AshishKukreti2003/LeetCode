/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumGap = function(nums) {
    if(nums.length < 2)
        return 0;
    
    nums = sort(nums);
    let maxGap = 0;
    for(let i=1;i<nums.length;i++){
        maxGap = Math.max(maxGap,nums[i] - nums[i-1]);
    }
    return maxGap;
};

function sort(nums){
    if (nums.length <= 1) {
        return nums;
    }
    let mid = Math.floor(nums.length/2);
        let left = sort(nums.slice(0,mid));
        let right = sort(nums.slice(mid,nums.length));
        
        return merge(left,right);
        
    }
    
function merge(left,right){
        let mix = [];
        let i=0,j=0;
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                mix.push(left[i]);
                i++;
            }else{
                mix.push(right[j]);
                j++;
            }
        }
        while(i<left.length){
            mix.push(left[i]);
            i++;
        }
        while(j<right.length){
            mix.push(right[j]);
            j++;
        }
    return mix;
    }