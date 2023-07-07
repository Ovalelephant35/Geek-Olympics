import java.util.Arrays;
class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        int[] arr1 = new int[n];
        for(int i=0 ; i<n ;i++){
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        if(Arrays.equals(arr1 , arr))return true;
        else return false;
    }
}
