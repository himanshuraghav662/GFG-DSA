class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node first=head;
        Node second=head;
        int flag=0;
        while(second.next!=null && second.next.next!=null){
            first=first.next;
            second=second.next.next;
            if(first==second){
                flag=1;
                break;
            }
        }
        if(flag==1){
            while(true){
                if(head==first)
                return head;
                
                head=head.next;
                first=first.next;
            }
        }
        return null;
    }
}
