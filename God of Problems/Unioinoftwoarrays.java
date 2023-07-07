import java.util.*;
class Solution{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        int[] arr = new int[n+m];
        for(int i=0 ; i<n ; i++){
            arr[i]=arr1[i];
        }
        for(int i=0 ; i<m ; i++){
            arr[i+n] = arr2[i];
        }
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i=0 ; i<(n+m-1) ; i++){
            if(arr[i]!=arr[i+1])ans.add(arr[i+1]);
        }
        return ans;
    }
}
