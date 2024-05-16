class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums = new int[n1+n2];
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n1; i++) {
            nums[index++] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            nums[index++] = nums2[i];
        }
        Arrays.sort(nums);
        if(n%2 == 0){
            return (nums[n/2-1]+nums[n/2])/2.0;
        }
        return nums[n/2];
    }
}