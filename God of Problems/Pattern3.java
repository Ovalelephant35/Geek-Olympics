class Solution {

    void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(j+" ");
                }
               
            }
             System.out.println();
        }
    }
}
