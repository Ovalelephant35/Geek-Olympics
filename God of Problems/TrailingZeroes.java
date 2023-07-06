class Solution {
    static int trailingZeroes(int N) {
        int count = 0;
        
        // Divide N by powers of 5 and count the number of multiples of 5
        while (N >= 5) {
            N /= 5;
            count += N;
        }
        
        return count;
    }
}
