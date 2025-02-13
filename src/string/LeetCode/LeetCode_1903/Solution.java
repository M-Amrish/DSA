package string.LeetCode.LeetCode_1903;

// TC - O(N), SC - O(1)
class Solution {
    public String largestOddNumber(String num) {
        String str = "";
        int n = num.length();

        for(int i=n-1; i>=0; i--){
            if(num.charAt(i)%2 !=0){
                str = num.substring(0,i+1);
                break;
            }
        }
        return str;
    }
}