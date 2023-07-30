class Solution{
public:
    int maxInstance(string s){
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
            
        for(int i=0 ; i<s.length() ;i++){
            if(s[i]=='b')b++;
            else if(s[i]=='a')a++;
            else if(s[i]=='l')l++;
            else if(s[i]=='o')o++;
            else if(s[i]=='n')n++;
        }
        int ans = 0;
        while(true){
            if(b==0 || a==0 || l==0 || o==0 || n==0 || l==1 || o==1 )break;
            b--;
            a--;
            l--;
            l--;
            o--;
            o--;
            n--;
            ans++;
        }
        return ans;
    }
};