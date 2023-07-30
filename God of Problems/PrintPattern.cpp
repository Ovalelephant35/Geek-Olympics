class Solution{
public:
    vector<int> pattern(int N){
    vector<int> ans;
    int i = N;
    ans.push_back(i);
    while (i > 0) {
        i -= 5;
        ans.push_back(i);
    }
    i += 5;
    ans.push_back(i);

    while (i < N) {
        i += 5;
        ans.push_back(i);
    }
    return ans;
}
};