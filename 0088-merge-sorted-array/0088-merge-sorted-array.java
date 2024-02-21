class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = m + n - 1;
        int k = n - 1;
        for (j = m + n - 1; j >= 0 && k >= 0;j--) {
            if (i >= 0 && nums1[i] > nums2[k]) {
                int temp = nums1[i];
                nums1[i] = nums1[j];
                nums1[j] = temp;
                i--;
            } else {
                int temp = nums1[j];
                nums1[j] = nums2[k];
                nums2[k] = temp;
                k--;
            }
            
        }
    }
}
