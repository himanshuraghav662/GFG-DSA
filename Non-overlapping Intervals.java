class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
         Arrays.sort(intervals, (a, b) -> 
        a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

        int prevEnd = intervals[0][1];
        int removalCount = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                removalCount++;
                prevEnd = Math.min(prevEnd, intervals[i][1]);
            } else {
                prevEnd = intervals[i][1];
            }
        }

        return removalCount;
    }
}
