class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        nums1 = mergeSort(nums1);
        nums2 = mergeSort(nums2);
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        
        int[] arr = new int[list.size()];
        int o=0;
        for(int num: list){
            arr[o++] = num;
        }
        return arr;
    }
    
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        
        return merge(left,right);
    }
    
    public static int[] merge(int[] left, int[] right){
        int[] main = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                main[k] = left[i];
                i++;
            }else{
                main[k] = right[j];
                j++;
            }
            k++;
        }
        
        while(i<left.length){
            main[k] = left[i];
            k++;
            i++;
        }
        while(j<right.length){
            main[k] = right[j];
            j++;
            k++;
        }
        
        return main;
    }
}