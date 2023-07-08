class Sol{
    public static int matSearch(int mat[][], int N, int M, int X){
        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ;j++){
                if(X ==mat[i][j])return 1;
            }
        }
        return 0;
    }
}
