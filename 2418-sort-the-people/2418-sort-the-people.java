class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<names.length;i++){
            for(int j=i+1;j<names.length;j++){
                if(heights[i] < heights[j]){
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                    String temp2 = names[i];
                    names[i] = names[j];
                    names[j] = temp2;
                }
            }
        }
        return names;
    }
}