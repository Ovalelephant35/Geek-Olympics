class Solution {

    void printTriangle(int n) {
        char c = 'A';
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print((char)(c-j+n)+" ");
            }
            System.out.println();
        }
    }
}
