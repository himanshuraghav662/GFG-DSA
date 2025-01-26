class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
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
        first=head;
       if(flag==1 && first!=second){
          while(true){
              if(first.next==second.next){
                 break;
              }
              first=first.next;
              second=second.next;
          }
        }else if(flag==1 && first==second){
            while(second.next!=first){ second=second.next;}
        }
        if(flag==1)
        second.next=null;
    }
}
