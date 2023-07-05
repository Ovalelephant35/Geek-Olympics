
class Solution {

    void printSquare(int n) {
        for(int i=1 ; i<=2*n ;i++){
            if(i%2==0){
                System.out.println();
            }
            else{
                if(i==1 || i==((2*n)-1)){
                    for(int j=0 ;j<n ;j++){
                        System.out.print("*");
                    }
                }
                else{
                     for(int j=0 ;j<n ;j++){
                        if(j==0 || j==n-1){
                        System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
}
