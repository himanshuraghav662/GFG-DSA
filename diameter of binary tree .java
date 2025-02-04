class Solution {
    int ans=0;
    
    int height(Node root){
        if(root==null)
        return 0;
        
        int a=height(root.left);
        int b=height(root.right);
        
        ans=Math.max(ans,a+b);
        
        return Math.max(a,b)+1;
    }
    
    int diameter(Node root) {
    height(root);
    return ans;
    }
}
