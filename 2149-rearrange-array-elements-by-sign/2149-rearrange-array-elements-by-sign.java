class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> post = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                post.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        int[] ans = new int[nums.length];
        int posIndex = 0, negIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                ans[i] = post.get(posIndex++);
            }else{
                ans[i] = neg.get(negIndex++);
            }
        }
        return ans;
    }
}