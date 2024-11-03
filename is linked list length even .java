class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        Node loc=head;
        boolean ans=true;
        while(loc!=null){
            ans=!ans;
            loc=loc.next;
        }
        return ans;
    }
}
