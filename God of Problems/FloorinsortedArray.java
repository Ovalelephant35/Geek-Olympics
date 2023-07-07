class Solution{
    static int findFloor(long arr[], int n, long x){
        int tmp=-1;
        for(int i=0 ; i<n ;i++){
            if(arr[i]<=x)tmp=i;
            else break;
        }
        return tmp;
        
    }
    
}
