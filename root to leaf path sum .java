class Solution {
    public static void helper(Node root, long temp, long[] ans){
        if(root==null)return;     //base case
        
        int value=root.data;    //hypothesis
        temp=(temp*10)+value;
        if(root.left==null && root.right==null){
            ans[0]+=temp;
            return;
        }
        
        helper(root.left,temp,ans);   //induction
        helper(root.right,temp,ans);
        
    }
    public static long treePathsSum(Node root) {
        // add code here.
        long[] ans={0};
        long temp=0;
        helper(root,temp,ans);
        return ans[0];
    }
}
