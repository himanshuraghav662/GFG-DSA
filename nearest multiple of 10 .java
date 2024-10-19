class Solution {

    String roundToNearest(String str) {

        int length = str.length();
        
     
        int lastDigit = str.charAt(length - 1) - '0'; 
      
        StringBuilder roundedNumber = new StringBuilder(str.substring(0, length - 1));
        

        if (lastDigit <= 5) {
            roundedNumber.append('0'); 
        } 
       
        else {
           
            int i = length - 2;
            boolean carry = true;
            
            while (i >= 0 && carry) {
                char currentDigit = roundedNumber.charAt(i);
                if (currentDigit == '9') {
                    roundedNumber.setCharAt(i, '0');  
                    roundedNumber.setCharAt(i, (char)(currentDigit + 1));  // Increment the digit
                    carry = false; 
                i--;
            }
            
            
            if (carry) {
                roundedNumber.insert(0, '1');
            }
            
         
            roundedNumber.append('0');
        }
        
        return roundedNumber.toString();
    }
}
