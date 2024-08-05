class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Float> list = new ArrayList<>();
        int left = 0,right = nums.length-1;
        while(left<right){
            float avg = (nums[left]+nums[right])/2.0f;
            if(!list.contains(avg)){
                list.add(avg);
            }
            left++;
            right--;
        }
        return list.size();
    }
}