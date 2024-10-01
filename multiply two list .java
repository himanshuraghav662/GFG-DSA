class Solution {
    private final long mod=1000000007;
    public long multiplyTwoLists(Node first, Node second) {
        long a=ans(first);
        long b=ans(second);
        return (a*b)%mod;
        
    }
    private long ans(Node node){
        long k=0;
        while(node!=null){
            k=(k*10+node.data)%mod;
            node=node.next;
        }
        return k;
    }
}
