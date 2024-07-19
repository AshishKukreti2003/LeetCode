/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    const arr = [];
    let i=1;
    while(i<nums.length){
        let correct = nums[i]-1;
        if(nums[i]!=nums[correct]){
            swap(nums,i, correct);
        }else{
            i++;
        }
    }
    for(let i=0;i<nums.length;i++){
        if(nums[i] !=i+1){
            arr.push(i+1);
        }
    }
    return arr;
    
    function swap(arr,i,j){
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
};