import java.util.*;
class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int arr1[] = new int[K*K];
        int tmp = 0;
        for(int i=0 ; i<K ;i++){
            for(int j=0 ; j<K ; j++){
                arr1[tmp] = arr[i][j];
                tmp++;
            }
        }
        Arrays.sort(arr1);
       for(int i=0 ; i<K*K ; i++){
           ans.add(arr1[i]);
       }
        
        return ans;
    }
}
