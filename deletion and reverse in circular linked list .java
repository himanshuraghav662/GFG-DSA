class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        Node prev=null;
        Node current=head;
        Node next=null;
        do{
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }while(current!=head);
        head.next=prev;
        return prev;
    }

    Node deleteNode(Node head, int key) {
        // code here
        Node flag=head;
        Node first=head;
        Node second=head.next;
           if (first.data == key) {

        if (first.next == first) {
            return null;  
        }

        while (second.next != flag) {
            second = second.next;
        }

        second.next = first.next;
        head = first.next;
        first.next = null;  
        return head;
    }
        if(second.data==key && second.next==flag){
            head.next=null;
            return head;
        }
        while(first.next!=flag){
            if(second.data==key){
                first.next=second.next;
                second.next=null;
                return head;
            }
            first=first.next;
            second=second.next;
        }
        return head;
    }
}
