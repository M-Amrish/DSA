package greedy.Scaler.Another_Coin_Problem;

import java.util.ArrayList;

// Optimal Solution TC - O(N), SC - O(N).

public class Solution {
    public int solve(int A) {
        ArrayList< Integer > al = new ArrayList <> ();

        int val = 1;

        // Storing all denominations of coins
        while (val <= A) {
            al.add(val);
            val = val * 5;
        }

        int ans = 0;
        // Loop from the largest denomination
        for (int i = al.size()-1; i >=0 ; i--) {
            ans += A / al.get(i);
            A = A % al.get(i);
        }
        return ans;
    }
}
