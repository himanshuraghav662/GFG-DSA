    public static long[] nextLargerElement(long[] arr, int n)
    { 
     long[] a=new long[n];
     Stack<Long> s=new Stack<Long>();
     for(int i=n-1;i>=0;i--){
         if(s.empty()==true){
             a[i]=-1;
         }
         else if(s.empty()!=true && s.peek()>arr[i]){
             a[i]=s.peek();
         }
         else if(s.empty()!=true && s.peek()<=arr[i]){
             while(s.empty()!=true && s.peek()<=arr[i]){
                 s.pop();
             }
             if(s.empty()==true)
             a[i]=-1;
             else
             a[i]=s.peek();
         }
         s.push(arr[i]);
     }
    return a;
    } 
}
