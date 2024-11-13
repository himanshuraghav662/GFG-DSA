class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        // code here
        int l1=0;
        int l2=0;
        Node temp=head1;
        while(temp!=null){
            l1++;
            temp=temp.next;
        }
        temp=head2;
         while(temp!=null){
            l2++;
            temp=temp.next;
        }
        if(l1<l2){
            int nex=l2-l1;
            while(nex!=0){
                head2=head2.next;
                nex--;
            }
        }else if(l1>l2){
             int nex=l1-l2;
            while(nex!=0){
                head1=head1.next;
                nex--;
            }
        }else{
        
        }
        while(head1!=null){
            if(head1==head2)
            return head1.data;
            
            head1=head1.next;
            head2=head2.next;
        }
     return -1;
    }
}
