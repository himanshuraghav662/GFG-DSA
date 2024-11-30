class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
       if(s1.length()!=s2.length())
            return false;

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++) {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
        }

        for(int val:map.values()) {
            if(val!=0)
                return false;
        }

        return true;
    }
}
