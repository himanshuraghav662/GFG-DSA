class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        Node head=new Node(arr[0][0]);
        Node loc=head;
        
        for(int i=0;i<arr.length;i++){
            Node curr=loc;
            for(int j=0;j<arr.length;j++){
                if(j+1!=arr.length){
                    Node tem=new Node(arr[i][j+1]);
                    loc.right=tem;
                }
                else{
                    loc.right=null;
                }
                
                if(i+1!=arr.length){
                    Node dem=new Node(arr[i+1][j]);
                    loc.down=dem;
                    loc=loc.right;
                }
                else{
                    loc.down=null;
                    if(j+1!=arr.length)
                    loc=loc.right;
                }
            }
            loc=curr.down;
        }
        return head;
    }
}
