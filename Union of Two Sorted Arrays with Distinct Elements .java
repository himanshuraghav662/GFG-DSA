class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
          ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        
        for(int num : a) {
            set.add(num);
        }
        
        for(int num : b) {
            set.add(num);
        }
        ans.addAll(set);
        Collections.sort(ans);
        return ans;
    }
}
