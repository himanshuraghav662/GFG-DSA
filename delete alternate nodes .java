class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        if(head.next!=null){
        Node curr=head;
        Node next=null;
        Node del=null;
        while(curr.next!=null){
            if(curr.next.next==null){
                curr.next=null;
                break;
            }
            else{
                del=curr.next;
                next=del.next;
                del.next=null;
                curr.next=next;
            }
            curr=curr.next;
        }
        }
    }
}
