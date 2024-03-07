class Solution {
    public boolean isPalindrome(String s) {
        
        String output = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(output).reverse();
        if(output.equals(reversed.toString())){
            return true;
        }
            
        return false;
    }
}