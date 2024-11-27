class Solution {
    public int myAtoi(String s) {
        // Your code here
         s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int index = 0;
        long result = 0;
        int n = s.length();
        
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        while (index < n && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE; // Handle underflow
            index++;
        }

        return (int) (sign * result);
    }
}
