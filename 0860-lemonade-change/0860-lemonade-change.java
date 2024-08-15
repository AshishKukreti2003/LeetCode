class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int nums:bills){
            if(nums == 5){
                five++;
            }else if(nums == 10){
                if(five > 0){
                    five--;
                    ten++;
                }else{
                    return false;
                }
            }else{
                if(ten > 0 && five > 0){
                    five--;
                    ten--;
                }else if(five >=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}