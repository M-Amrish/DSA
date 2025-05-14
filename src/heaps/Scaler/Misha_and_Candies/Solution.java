package heaps.Scaler.Misha_and_Candies;

import java.util.ArrayList;
import java.util.PriorityQueue;

// Optimal Solution TC - O(NlogK), SC - O(K).
// K = B = number of negations required to be performed on the array A of size N .
// N = size of the array A.
// B = number of candies Misha has.

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int c = 0;

        for(Integer i : A){
            pq.add(i);
        }

        while(pq.peek() <= B){
            int min = pq.remove();

            c += min/2;
            min = min - (min/2);

            if(!pq.isEmpty()){

                pq.add(pq.remove() + min);
            }else{
                break;
            }
        }
        return c;
    }
}

// Brute Force Solution TC - O(N*N), SC - O(1).
// public int solve(ArrayList<Integer> A, int B) {
//     int c = 0;
//
//     for(int i=0; i<A.size(); i++){
//         for(int j=i+1; j<A.size(); j++){
//             if(A.get(i) + A.get(j) <= B){
//                 c += 1;
//             }
//         }
//     }
//     return c;
// }


