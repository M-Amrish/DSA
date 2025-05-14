package heaps.Scaler.Maximum_array_sum_after_B_negations;

import java.util.ArrayList;
import java.util.PriorityQueue;

// Optimal Solution TC - O(NlogK), SC - O(K).
// K = B = number of negations required to be performed on the array A of size N .

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(Integer i : A){
            pq.add(i);
        }

        for(int i=0; i<B; i++){
            pq.add(pq.remove() *-1);
        }

        int sum = 0;

        while(! pq.isEmpty() ){
            sum += pq.remove();
        }

        return sum;
    }
}

// brute force TC - O(NlogN), SC - O(1).

//    public int solve(ArrayList<Integer> A, int B) {
//        int sum = 0;
//        for(int i=0; i<A.size(); i++){
//            for(int j=0; j<B; j++){
//                A.set(i, A.get(i) * -1);
//            }
//            sum += A.get(i);
//        }
//        return sum;
//    }
//
