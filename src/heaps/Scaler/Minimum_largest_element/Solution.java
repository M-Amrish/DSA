package heaps.Scaler.Minimum_largest_element;

import java.util.PriorityQueue;

public class Solution {
    class Pair{
        int val,ind;
        Pair(int x, int y) {
            val=x;
            ind=y;
        }
    }
    public int solve(int[] A, int B) {
        int n = A.length;
        int[] state=A.clone();
        PriorityQueue<Pair> pq = new PriorityQueue<>( (a, b) -> a.val - b.val );

        for(int i=0;i<n;i++) {
            int data=state[i]+A[i];
            Pair p=new Pair(data,i);
            pq.add(p);
        }

        for(int i=0;i<B;i++) {
            int value=pq.peek().val;
            int index =pq.peek().ind;
            pq.remove();
            state[index]=value;
            Pair p=new Pair(value+A[index], index);
            pq.add(p);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            max = Math.max(state[i], max);
        }
        return max;
    }
}

