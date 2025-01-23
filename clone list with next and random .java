class Solution {
    public Node cloneLinkedList(Node head) {
       HashMap<Node,Node> map=new HashMap<>();
       Node ans=head;
       while(ans!=null){
           map.put(ans,new Node(ans.data));
           ans=ans.next;
       }
       ans=head;
       while(ans!=null){
           Node temp=map.get(ans);
           temp.next=map.get(ans.next);
           temp.random=map.get(ans.random);
           ans=ans.next;
       }
        ans=map.get(head);
       return ans;
    }
}
