class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> set =new HashSet<>();
        int ans=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)==true){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            ans=Math.max(ans,i-j+1);
        }    
       return ans; 
    }
}
