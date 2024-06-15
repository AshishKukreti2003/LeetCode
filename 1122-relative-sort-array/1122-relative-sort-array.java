class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    list.add(arr1[j]);
                }
            }
            
        }
        Set<Integer> set = new HashSet<>();
        for(int num:arr2){
            set.add(num);
        }
        ArrayList<Integer> remaining = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(!set.contains(arr1[i])){
                remaining.add(arr1[i]);
            }
        }
        
        Collections.sort(remaining);
        list.addAll(remaining);
        for(int i=0;i<list.size();i++){
            arr1[i] = list.get(i);
        }
        return arr1;
    }
}