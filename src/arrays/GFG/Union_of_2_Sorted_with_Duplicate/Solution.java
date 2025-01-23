package arrays.GFG.Union_of_2_Sorted_with_Duplicate;

import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        int i=0, j=0;

        while(i<a.length && j<b.length){
            // If both elements are equal
            if (a[i] == b[j]) {
                if (al.size() == 0 || al.get(al.size() - 1) != a[i]) {
                    al.add(a[i]);
                }
                i++;
                j++;
            }
            // If element in array 'a' is smaller
            else if (a[i] < b[j]) {
                if (al.size() == 0 || al.get(al.size() - 1) != a[i]) {
                    al.add(a[i]);
                }
                i++;
            }
            // If element in array 'b' is smaller
            else {
                if (al.size() == 0 || al.get(al.size() - 1) != b[j]) {
                    al.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(al.size() == 0 || al.get(al.size()-1) != a[i]){
                al.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(al.size() == 0 || al.get(al.size()-1) != b[j]){
                al.add(b[j]);}
            j++;
        }
        return al;
    }
}
