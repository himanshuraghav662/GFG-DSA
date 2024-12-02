class Solution {
    public int[] helper(String pat) {
        int m=pat.length();
        int[] arr=new int[m];
        int len=0;
        int i=1;
        while(i<m) {
            if(pat.charAt(i)==pat.charAt(len)) {
                len++;
                arr[i]=len;
                i++;
            } else{
                if(len!=0) 
                len=arr[len-1];
                else
                arr[i++]=0;
            }
        }
        return arr;
    }

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
         ArrayList<Integer> result=new ArrayList<>();
        int n=txt.length();
        int m=pat.length();
        int[] arr=helper(pat);
        int i=0;
        int j=0;
        while(i<n) {
            if(txt.charAt(i)==pat.charAt(j)) {
                i++;j++;
                if(j==m) {
                    result.add(i-m);
                    j=arr[j-1];
                }
            } else{
                if(j!=0)
                j=arr[j-1];
                else i++;
            }
        }
        return result;
    }
    
}
