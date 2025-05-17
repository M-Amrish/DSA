package greedy.Scaler.Finish_Maximum_Jobs;

// Problem Description
//There are N jobs to be done, but you can do only one job at a time.
// Given an array A denoting the start time of the jobs and an array B denoting the finish time of the jobs.
// Your aim is to select jobs in such a way so that you can finish the maximum number of jobs.

// TC - O(NlogN), SC - O(1)



import java.util.Arrays;

class Job {
    int start;
    int end;

    Job(int start, int end) {
        this.start = start;
        this.end = end;
    }
}


public class Solution {
    public int solve(int[] A, int[] B) {

        Job work[] = new Job[A.length];

        for(int i=0; i<A.length; i++){
            work[i] = new Job(A[i], B[i]);
        }

        Arrays.sort(work,(a, b) -> a.end - b.end);

        int end = work[0].end;
        int count = 1;
        for(int i=1; i<work.length; i++){

            if( work[i].start >= end){
                count++;
                end = work[i].end;
            }

        }
        return count;
    }
}
