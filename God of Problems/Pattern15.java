class Solution {

    void printTriangle(int n) {
        char c = 'A';
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i+1 ;j++){
                System.out.print((char)(c+j-1));
            }
            System.out.println();
        }
    }
}
