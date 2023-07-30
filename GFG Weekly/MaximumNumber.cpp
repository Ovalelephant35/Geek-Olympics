class Solution {
  public:
    int maximumNumber(int N) {
        int n=N;
        int num = static_cast<int>(log10(N)) + 1;
        for(int i=num-1 ; i>=0 ; i--){
             int res = pow(10, i);
             int ch = n/res;
             if(ch==7){
                 N+=(2*res);
                 break;
             }
             n%=res;
        }
        return N;
    }
};