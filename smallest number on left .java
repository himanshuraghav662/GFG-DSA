class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        Stack<Integer> s =new Stack<Integer>();
        List<Integer> l =new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.empty()==true){
                l.add(-1);
            }
            else if(s.empty()!=true && s.peek()>=a[i]){
                while(s.empty()!=true && s.peek()>=a[i]){
                    s.pop();
                }
                if(s.empty()==true)
                l.add(-1);
                else
                l.add(s.peek());
            }
            else{
                l.add(s.peek());
            }
            s.push(a[i]);
        }
        return l;
    }
}
