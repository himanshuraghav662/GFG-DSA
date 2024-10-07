class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        if(head.next==null || head.next.next==null)
        return false;
        
        Node slow=head.next;
        Node fast=head.next.next;
        while(fast.next!=null && fast.next.next!=null){
            if(slow==fast)
            return true;
            
            slow=slow.next;
            fast=fast.next.next;
        }
       return false; 
    }
}
