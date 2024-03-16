/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int targetIndex = BinarySearchOrderAgnostic(mountainArr, target, 0, peak);
        if(targetIndex != -1){
            return targetIndex;
        }
        
        return BinarySearchOrderAgnostic(mountainArr, target, peak, mountainArr.length()-1);
    }
    
    static int peakIndexInMountainArray(MountainArray mountainArr) {
        int result = 0;
        int start = 0;
        int end = mountainArr.length()-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
    
    static int BinarySearchOrderAgnostic(MountainArray mountainArr,int target, int start, int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) == target){
                return mid;
            }
            if(isAsc){
                if (mountainArr.get(mid) < target) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
            else{
                if (mountainArr.get(mid) > target) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                } 
            }
        }
        return -1;
    }
}