class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node loc=head;
        Node curr=null;
        Node pre=null;
        if(loc.data>=x){
          Node temp=new Node(x);
          temp.next=head;
          head.prev=temp;
          temp.prev=null;
          return temp;
        }
        while(loc!=null){
            if(loc.data<=x){
                pre=loc;
                if(loc.next==null)
                curr=null;
                else
                curr=loc.next;
            }
            loc=loc.next;
        }
        if(curr==null){
            Node temp=new Node(x);
            pre.next=temp;
            temp.next=null;
            temp.prev=pre;
        }else{
            Node temp=new Node(x);
            pre.next=temp;
            temp.next=curr;
            temp.prev=pre;
            curr.prev=temp;
        }
        return head;
    }
}
