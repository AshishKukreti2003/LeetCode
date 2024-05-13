class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = num.length-1;
        while(i >= 0 || k >0){
            if(i>=0){
                list.add((num[i] + k)%10);
                k = (num[i] +k)/10;
            }else{
                list.add(k%10);
                k/=10;
            }
            i--;
        }
        Collections.reverse(list);
        return list;
        
    }
}