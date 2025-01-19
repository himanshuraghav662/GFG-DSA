class Solution {
    public Node rotate(Node head, int k) {
        int n=0;
        Node start=head;
        while(start!=null){
            n++;
            if(start.next==null)
            start=null;
            else
            start=start.next;
        }
        if(n==1 || n==k){return head;}
        if(k>n){ n=k%n; }
        else{n=k;}
        if(n==0){return head;}
        Node prev=head;
        start=head;
        while(n>0){
            prev=start;
            start=start.next;
            n--;
        }
        prev.next=null;
        prev=start;
        while(prev.next!=null){prev=prev.next;}
        prev.next=head;
        return start;
    }
}
