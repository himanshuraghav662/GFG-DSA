class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        long a=n;
        // Your code here
        if(n==1)
        return true;
        if(n%2!=0){
            return false;
        }
            while(a>=16 && a%16==0){
                a=a/16;
            }
             while(a>=2 && a%2==0){
                a=a/2;
            }
            if(a==1)
            return true;
        
       return false; 
    }
    
}
