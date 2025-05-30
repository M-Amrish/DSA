package greedy.LeetCode.LeetCode_860;

// TC - O(N), SC - O(1)


class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for(int i=0; i<bills.length; i++){

            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                if(five > 0){
                    five--;
                    ten++;
                }
                else
                    return false;
            }
            else{
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }
                else if(five > 2){
                    five = five - 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}