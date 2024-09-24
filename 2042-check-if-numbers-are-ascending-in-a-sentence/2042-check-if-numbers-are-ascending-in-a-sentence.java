class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String str: words){
            if(str.matches("\\d+")){
                if(Integer.parseInt(str) > 0 )
                    list.add(Integer.parseInt(str));
            }
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}