import java.util.*;
class Solution {

    int median(int matrix[][], int R, int C) {
        int[] ans = new int[R*C];
        int tmp =0;
        for(int i= 0 ;i<R ;i++){
            for(int j=0 ; j<C ;j++){
                ans[tmp] = matrix[i][j];
                tmp++;
            }
        }
        Arrays.sort(ans);
        return ans[(((R*C)+1)/2)-1];
    }
}
