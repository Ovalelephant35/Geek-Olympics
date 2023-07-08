class Solution{
    public:
    int search(int A[], int l, int h, int key){
        int ans = -1;
        for(int i=0 ; i<=h ;i++){
            if(A[i]==key)ans=i;
        }
        return ans;
    }
};