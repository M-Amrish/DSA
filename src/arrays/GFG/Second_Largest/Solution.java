package arrays.GFG.Second_Largest;

class Solution {
    public int getSecondLargest(int[] arr) {

        int largest = arr[0];
        int slargest = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){ // finding the first largest
                slargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]> slargest){ //  finding the second largest
                slargest = arr[i];
            }
        }
        return slargest;
    }
}
