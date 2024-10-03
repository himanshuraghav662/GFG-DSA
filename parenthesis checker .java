class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='(' || x.charAt(i)=='[' || x.charAt(i)=='{'){
                st.push(x.charAt(i));
            }
            else if(st.empty()!=true && x.charAt(i)==')' && st.peek()=='(')
            st.pop();
            else if(st.empty()!=true && x.charAt(i)=='}' && st.peek()=='{')
            st.pop();
            else if(st.empty()!=true && x.charAt(i)==']' && st.peek()=='[')
            st.pop();
            else
            return false;
            
        }
        if(st.empty()==true)
        return true;
        else
        return false;
    }
}
