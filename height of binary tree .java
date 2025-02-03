class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node==null){
            return -1;
        }
        int a= height(node.left);
        int b= height(node.right);
        
        return Math.max(a,b)+1;
    }
}
