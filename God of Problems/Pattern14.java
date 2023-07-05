class Solution {

    void printTriangle(int n) {
        char c = '@';
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print((char)(c+j));
            }
            System.out.println();
        }
    }
}
