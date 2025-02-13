package trees.GFG.introduction_to_tree;

// TC - O(N), SC - O(1)

class Solution {
    static int countNodes(int i) {
        if( i == 1){return 1;}

        return 2*countNodes(i-1);
    }
}
