class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        nums1 = merge(nums1);
        nums2 = merge(nums2);
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums2[j]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        
        int[] arr = new int[list.size()];
        i=0;
        for(int num: list){
            arr[i++] = num;
        }
        return arr;
    }
    
    private static int[] merge(int[] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge(Arrays.copyOfRange(arr,mid,arr.length));
        
        return mergeSort(left,right);
    }
    
    private static int[] mergeSort(int[] left, int[] right){
        int[] main = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                main[k++] = left[i++];
            }else{
                main[k++] = right[j++];
            }
        }
        
        while(i<left.length){
            main[k++] = left[i++];
        }
        
        while(j<right.length){
            main[k++] = right[j++];
        }
        
        return main;
    }
}