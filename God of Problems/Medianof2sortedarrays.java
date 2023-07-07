import java.util.*;
class GFG { 
    static double medianOfArrays(int n, int m, int a[], int b[]) {
        int[] arr = new int[n+m];
        for(int i=0 ; i<n ; i++){
            arr[i]=a[i];
        }
        for(int i=0 ; i<m ; i++){
            arr[i+n] = b[i];
        }
        Arrays.sort(arr);
        if((n+m)%2==1)return (double)arr[((n+m+1)/2)-1];
        else{
            double ans = ((double)arr[((n+m)/2)-1] + (double)arr[((n+m)/2)])/2;
            return ans;
        }
    }
}
