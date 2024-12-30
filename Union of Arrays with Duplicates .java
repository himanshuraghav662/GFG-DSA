class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set= new HashSet<>();
        set.add(a[0]);
        int ans=1;
        for(int i=1;i<a.length;i++){
            if(set.contains(a[i])==false){
                set.add(a[i]);
                ans++;
            }
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])==false){
                set.add(b[i]);
                ans++;
            }
        }
       return ans; 
    }
}
