class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        int length=0;
        int ans=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
        int stop=length-n;
        length=0;
        while(temp!=null){
            length++;
            if(length>stop){
                ans+=temp.data;
            }
            temp=temp.next;
        }
      return ans;  
    }
}
