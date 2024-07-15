class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        return helper("",digits);
    }
    
    private static final String[] key = {
        "",
        "",
        "abc", 
        "def", 
        "ghi", 
        "jkl", 
        "mno", 
        "pqrs",
        "tuv", 
        "wxyz"
    };
    
    static List<String> helper(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        int digits = up.charAt(0) - '0';
        String letters = key[digits];
        
        for(int i=0;i<letters.length();i++){
            char ch = letters.charAt(i);
            ans.addAll(helper(p+ch,up.substring(1)));
        }
        return ans;
    }
}