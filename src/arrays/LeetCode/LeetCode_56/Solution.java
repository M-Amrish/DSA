package arrays.LeetCode.LeetCode_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> Integer.compare(a[0] , b[0] ));


        List<int[]> list = new ArrayList<>();


        for(int i=0; i<intervals.length; i++){

            if(list.isEmpty() || list.get(list.size()-1)[1] < intervals[i][0] ){
                list.add(intervals[i]);
            }else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], intervals[i][1]);
            }
        }

        return list.toArray(new int[list.size()][]);

//        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
//        int pointer = 0;
//        for (int i = 1; i < intervals.length; i++) {
//            if (intervals[pointer][1] >= intervals[i][0]) {
//                intervals[pointer][1] = Math.max(intervals[pointer][1], intervals[i][1]);
//            } else {
//                pointer++;
//                intervals[pointer] = intervals[i];
//            }
//        }
//        int[][] mergedIntervals = new int[pointer + 1][2];
//        for (int i = 0; i < pointer + 1; i++) {
//            mergedIntervals[i] = intervals[i];
//        }
//        return mergedIntervals;

    }
}
