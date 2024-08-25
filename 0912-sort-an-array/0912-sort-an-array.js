/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function(nums) {
    if(nums.length == 1){
        return nums;
    }
    let mid = Math.floor(nums.length/2);
    let left = sortArray(nums.slice(0,mid));
    let right = sortArray(nums.slice(mid,nums.length));
    
    return merge(left,right);
    
    function merge(left, right){
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
};