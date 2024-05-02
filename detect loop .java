class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
           boolean a=false;
      Node ptr=head;
      Node loc=head;
      int q=0;
      if(ptr==null || ptr.next==null){
          return false;
      }
      else{
      while(ptr.next.next!=null){
          ptr=ptr.next.next;
          if(q>0){
              if(ptr==loc){
                  return true;
              }
          }
          if(ptr.next==null || ptr.next.next==null){
              return false;
          }
          else{
              loc=loc.next;
              q++;

          }
          if(q>0){
              if(ptr==loc){
                  return true;
              }
          }

      }
      }
      return a;
    }
}
