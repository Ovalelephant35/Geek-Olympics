class Solution {
    int search(String text, String pat) {
        int tmp=0;
        int n = text.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            String substring = text.substring(i, i + m);
            if(pat.equals(substring)){
                tmp = 1;
                break;
            }
        }
        return tmp;
    }
};