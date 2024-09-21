class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int num: nums){
            if(num>0){
                set.add(num);
            }
        }
        int missing = 1;
        while(set.contains(missing)){
            missing++;
        }
        return missing;
    }
}