class Solution{
    public:	  
    long long int findBitwiseOR(long long int L, long long int R){
        while(L<R){
            L=L|(L+1);
        }
    return R|L;
    }
};
