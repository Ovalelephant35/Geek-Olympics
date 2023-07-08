class Solution {
    public static boolean Search(int N, int[] nums, int target) {
        for(int i=0 ; i<N ;i++){
            if(nums[i]==target)return true;
        }
        return false;
    }
}
